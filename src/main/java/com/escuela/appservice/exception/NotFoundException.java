package com.escuela.appservice.exception;

import com.escuela.appservice.helper.constants.ConstantsMessage;

public class NotFoundException extends Exception {

	public NotFoundException(String mensaje) {
		super(mensaje);
	}

	public NotFoundException() {
		super(ConstantsMessage.ERROR_DEFAULT);
	}

}
