package com.escuela.appservice.helper.constants;

public final class ConstantsValidators {

    private ConstantsValidators() {
    }

    // Regex and texts
    public static final String EXPRESION_REGULAR_DE_DIRECCIONES = "[a-zA-Z0-9- äÄëËïÏöÖüÜáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙñÑ//\\.]*#[a-zA-Z0-9- äÄëËïÏöÖüÜáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙñÑ//\\.]*";
    public static final String EXPRESION_REGULAR_DE_EMAILS = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    public static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    // Symbols and Constants
    public static final String AT_SIGN = "@";
    public static final String COLON = ":";
    public static final String SLASH = "/";
    public static final String COMODIN_BD = "%";
    public static final String SEPARADOR_TAGS = ";";
    public static final String SEPARADOR_SLASH = "/";
    public static final String GUION = "-";
    public static final String PHASE_CREATE = "C";
    public static final String PHASE_UPDATE = "U";
    public static final String PRODUCT_ID_SOLA_FIRMA = "1";
    public static final String PRODUCT_ID_CESION_FORWARD = "2";
    public static final int TAMANO_TOKEN = 11;
    public static final int MAX_LENGTH_50 = 50;
    public static final int MAX_LENGTH_30 = 30;
    public static final int ITERATIONS = 10000;
    public static final int KEY_LENGTH = 256;
    public static final int SALT_ENCRIPTAR_CLAVE = 28;

    // Keys Errors Code Names
    public static final String DATA_NOT_FOUND = "DATA_NOT_FOUND";
    public static final String BD_ERROR = "BD_ERROR";
    public static final String INTERNAL_SERVER_ERROR = "500_SERVER";
    public static final String BAD_REQUEST = "BAD_REQUEST";
    public static final String ALREADY_EXIST = "ALREADY_EXIST";
    public static final String NOT_EXIST = "NOT_EXIST";

}