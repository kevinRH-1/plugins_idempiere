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
public class ConsultarDolar extends SvrProcess {

	private String parametroEjemplo; // Aquí guardarás el valor de tu parámetro

	@Override
	protected void prepare() {
		// Aquí se leen todos los parámetros definidos en AD_Process_Para
		ProcessInfoParameter[] params = getParameter();
		for (ProcessInfoParameter param : params) {
			String name = param.getParameterName();
			if (name.equalsIgnoreCase("ref")) {
				parametroEjemplo = param.getParameterAsString();
			}
		}
	}

	@Override
	protected String doIt() throws Exception {
		// Puedes usar parametroEjemplo aquí
		System.out.println("Valor del parámetro recibido: " + parametroEjemplo);

		boolean createdTrx = false;
		Trx trx = Trx.get(get_TrxName(), false);
		if (trx == null) {
			trx = Trx.get(Trx.createTrxName("ConsultarDolar"), true);
			createdTrx = true;
		}

		PO po = MTable.get(getCtx(), getTable_ID()).getPO(getRecord_ID(), trx.getTrxName());
		if (po == null)
			return "Registro no encontrado";

		// Llamada al API
		URL url = new URL("https://ve.dolarapi.com/v1/dolares/oficial");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();

		if (conn.getResponseCode() != 200)
			return "Error al conectar con API";

		Scanner scanner = new Scanner(url.openStream());
		StringBuilder jsonText = new StringBuilder();
		while (scanner.hasNext()) {
			jsonText.append(scanner.nextLine());
		}
		scanner.close();

		JsonObject json = JsonParser.parseString(jsonText.toString()).getAsJsonObject();
		String promedio = json.get("promedio").getAsString();
		String fechaStr = json.get("fechaActualizacion").getAsString().replace("T", " ").replace("Z", "");
		Timestamp fecha = Timestamp.valueOf(fechaStr);

		po.set_ValueOfColumn("P_Dolar", promedio);
		po.set_ValueOfColumn("Description", promedio);
		po.set_ValueOfColumn("Name", parametroEjemplo);

		boolean saved = po.save();
		if (createdTrx) {
			if (saved)
				trx.commit();
			else
				trx.rollback();
			trx.close();
		}

		return "Datos actualizados: " + promedio + " / " + fecha;
	}
}
