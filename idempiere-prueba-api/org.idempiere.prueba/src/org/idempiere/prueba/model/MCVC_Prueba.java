package org.idempiere.prueba.model;

import org.idempiere.prueba.model.X_CVC_Prueba;
import java.util.Properties;
import java.sql.ResultSet;

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
}
