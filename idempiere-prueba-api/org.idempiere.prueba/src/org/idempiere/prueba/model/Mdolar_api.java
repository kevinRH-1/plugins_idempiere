package org.idempiere.prueba.model;
import org.idempiere.prueba.model.X_XX_dolar_api;
import java.util.Properties;
import java.sql.ResultSet;

public class Mdolar_api extends X_XX_dolar_api  {
	
	public Mdolar_api(Properties ctx, int T_dolar_api_id, String trxName) {
		super(ctx, T_dolar_api_id, trxName);
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {
		String name = getName();
		
		
		if(name == null || name.length()<=3) {
			log.saveError("Error", "El campo name debe tener mas de 3 caracteres");
			return false;
		}
		
		return true;
	}
		
	
}
