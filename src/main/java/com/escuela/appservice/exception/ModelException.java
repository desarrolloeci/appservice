package com.escuela.appservice.exception;

import com.escuela.appservice.helper.constants.ConstantsMessage;

public class ModelException extends Exception {

	public ModelException(String messageFriendly) {
		super(messageFriendly);
	}

	public ModelException() {
		super(ConstantsMessage.ERROR_DEFAULT);
	}

}
