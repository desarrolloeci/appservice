package com.escuela.appservice.exception;

import com.escuela.appservice.helper.constants.ConstantsMessage;

public class RequestException extends Exception {

	public RequestException(String mensaje) {
		super(mensaje);
	}

	public RequestException() {
		super(ConstantsMessage.ERROR_DEFAULT);
	}

}
