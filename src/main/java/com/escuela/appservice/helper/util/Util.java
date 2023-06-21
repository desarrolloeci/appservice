package com.escuela.appservice.helper.util;

import java.util.List;

public final class Util {

    private Util() {
    }

    public static boolean isNumeric(String cadena) {
        return isInteger(cadena) || isDouble(cadena) || isLong(cadena);
    }

    public static boolean isDouble(String cadena) {
        boolean resultado;
        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    public static boolean isLong(String cadena) {
        boolean resultado;
        try {
            Long.parseLong(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    public static boolean isInteger(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

}
