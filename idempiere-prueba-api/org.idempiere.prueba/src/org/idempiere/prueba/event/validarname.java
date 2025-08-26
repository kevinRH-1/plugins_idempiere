package org.idempiere.prueba.event;

import org.adempiere.base.annotation.EventTopicDelegate;
import org.adempiere.base.annotation.ModelEventTopic;
import org.adempiere.base.event.annotations.ModelEventDelegate;
import org.adempiere.base.event.annotations.po.BeforeChange;
import org.adempiere.base.event.annotations.po.BeforeNew;
import org.adempiere.exceptions.AdempiereException;
import org.osgi.service.event.Event;

import org.idempiere.prueba.model.X_XX_dolar_api;

@EventTopicDelegate
@ModelEventTopic(modelClass = X_XX_dolar_api.class)
public class validarname extends ModelEventDelegate<X_XX_dolar_api> {
	
	public validarname(X_XX_dolar_api po, Event event) {
		super(po, event);
	}

}
