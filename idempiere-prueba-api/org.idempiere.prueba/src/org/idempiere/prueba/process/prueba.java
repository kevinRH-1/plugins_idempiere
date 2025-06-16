package org.idempiere.prueba.process;

import org.idempiere.prueba.base.CustomProcess;
import org.zkoss.zk.ui.Executions;
import org.adempiere.base.annotation.Process;

@Process
public class prueba extends CustomProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		System.out.println("hola");
		System.out.println("¿Está en WebUI?: " + (Executions.getCurrent() != null));
		return "funciona";
	}

}
