package org.idempiere.prueba.process;

import java.util.Properties;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;

import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.process.ProcessCall;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Trx;
import org.adempiere.util.IProcessUI;
//import org.json.JSONObject;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.adempiere.base.annotation.Process;

@Process
public class ConsultarDolar implements ProcessCall {

	@Override
	public boolean startProcess(Properties ctx, ProcessInfo pi, Trx trx) {
		try {
            // 1. Obtener registro actual
			
			boolean createdTrx = false;
			if (trx == null) {
			    trx = Trx.get(Trx.createTrxName("ConsultarDolar"), true);
			    createdTrx = true;
			}
			System.out.println("Table ID: " + pi.getTable_ID());
			System.out.println("Record ID: " + pi.getRecord_ID());
			System.out.println("Transaction: " + trx.getTrxName());

            PO po = MTable.get(ctx, pi.getTable_ID()).getPO(pi.getRecord_ID(), trx.getTrxName());

            if (po == null) {
                return false;
            }

            // 2. Llamar API
            URL url = new URL("https://ve.dolarapi.com/v1/dolares/oficial");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                return false;
            }

            Scanner scanner = new Scanner(url.openStream());
            StringBuilder jsonText = new StringBuilder();
            while (scanner.hasNext()) {
                jsonText.append(scanner.nextLine());
            }
            scanner.close();

            // 3. Parsear JSON
            System.out.println(jsonText);
            JsonObject json = JsonParser.parseString(jsonText.toString()).getAsJsonObject();
            String promedio = json.get("promedio").getAsString();
            String fechaStr = json.get("fechaActualizacion").getAsString()
            	    .replace("T", " ")
            	    .replace("Z", "");

            Timestamp fecha = Timestamp.valueOf(fechaStr);

            // 4. Setear campos
            po.set_ValueOfColumn("P_Dolar", promedio);
            po.set_ValueOfColumn("Description", promedio);
//            po.set_ValueOfColumn("updated", fecha);
            System.out.println("Valor promedio: " + promedio);
            System.out.println("Descripción antes de guardar: " + po.get_Value("Description"));


//            po.saveEx();
            boolean saved = po.save();
            if (createdTrx) {
                if (saved) {
                    trx.commit();
                } else {
                    trx.rollback();
                }
                trx.close(); // 🔴 Esto evita el leak
            }

            // 5. Mensaje (opcional)
            IProcessUI processUI = pi.getProcessUI();
            if (processUI != null) {
                processUI.statusUpdate("Datos actualizados: " + promedio + " / " + fecha);
            }

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public void setProcessUI(IProcessUI processUI) {
		// TODO Auto-generated method stub
		
	}

}
