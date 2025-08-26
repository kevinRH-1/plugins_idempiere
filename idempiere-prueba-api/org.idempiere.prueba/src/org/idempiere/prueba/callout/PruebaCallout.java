package org.idempiere.prueba.callout;

import org.adempiere.base.annotation.Callout;
import org.idempiere.prueba.base.CustomCallout;

@Callout(tableName = "T_dolar_api", columnName = "Name")
public class PruebaCallout extends CustomCallout {
	@Override
    public String start() {
		System.out.println("empezando callout");
		Object value = getValue();
        if (value == null || value.toString().length() < 3)
            return "valor incorrecto, debe tener al menos 3 caracteres";
        System.out.println("valor en callout" + value);
        // Ejemplo: cambiar un campo automáticamente
        setValue("C_api", value);

        return null;
    }
}
