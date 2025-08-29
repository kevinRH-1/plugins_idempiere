package org.idempiere.prueba.process;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;

import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.Trx;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.adempiere.base.annotation.Process;

@Process
public class cambiarstatus extends SvrProcess{
	
	@Override
	protected void prepare() {
	}
	
	@Override
	protected String doIt() throws Exception {
		
		System.out.println("entro al proceso");
		
		boolean createdTrx =false;
		Trx trx = Trx.get(get_TrxName(), false);
		if (trx == null) {
			trx = Trx.get(Trx.createTrxName("CVC_Prueba"), true);
			createdTrx = true;
		}
		
		PO po = MTable.get(getCtx(), getTable_ID()).getPO(getRecord_ID(), trx.getTrxName());
		if (po == null)
			return "Registro no encontrado";
		String des = (String) po.get_Value("description");
		System.out.println("descripcion" + des);
		if (des == null || des.trim().isEmpty()) {
			return "error descripcion vacia";
		}else {
			po.set_ValueOfColumn("docstatus", "IP");
			boolean saved = po.save();
			if (createdTrx) {
				if (saved)
					trx.commit();
				else
					trx.rollback();
				trx.close();
			}
			return "status cambiado";
		}
	}

}
