package org.idempiere.prueba.model;

import org.idempiere.prueba.model.X_CVC_Prueba;
import java.util.Properties;
import java.sql.ResultSet;
import org.idempiere.prueba.model.X_CVC_Prueba_Detalles;

public class MCVC_Prueba extends X_CVC_Prueba{
	
	public MCVC_Prueba(Properties ctx, int CVC_Prueba_ID, String trxName) {
		super(ctx, CVC_Prueba_ID, trxName);
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {
		String name = getName();
		
		
		if(name == null || name.length()<=3) {
			log.saveError("Error", "El campo name debe tener mas de 3 caracteres");
			return false;
		}
		
		setDescription(name.substring(0,2));
		
		return true;
	}
	
	protected boolean afterSave(boolean newRecord, boolean success) {
		if(!success) {
			return success;
		}
		
		
		if(newRecord) {
			X_CVC_Prueba_Detalles detalles = new X_CVC_Prueba_Detalles(getCtx(), 0, get_TrxName());
			detalles.setCVC_Prueba_ID(getCVC_Prueba_ID());
			 detalles.setHelp("Detalle automático de la prueba con id: " + getCVC_Prueba_ID());
		     detalles.saveEx();
		}
		
		return success;
	}
}
