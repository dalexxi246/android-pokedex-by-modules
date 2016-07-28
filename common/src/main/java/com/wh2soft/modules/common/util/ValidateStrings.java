package com.wh2soft.modules.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Desarrollador on 23/02/2016.
 */
public class ValidateStrings {

    public static boolean isValidEmailAddress(String email) {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(EMAIL_REGEX);
    }

    public static boolean isValidName(String name) {
        String NAME_REGEX = "^[A-Za-zÁáÀàÉéÈèÍíÌìÓóÒòÚúÙùÑñüÜ]{2,}+$";
        return name.matches(NAME_REGEX);
    }

    public static boolean isValidPassword(String pass, int min_length, int max_length) {
        String NAME_REGEX = "^[a-zA-ZÁáÀàÉéÈèÍíÌìÓóÒòÚúÙùÑñüÜ0-9!@#\\$%\\^&\\*\\?_~\\/]{"+min_length+","+max_length+"}$";
        return pass.matches(NAME_REGEX);
    }

    public static boolean isFechaValida(String dateString) {
        String NAME_REGEX = "^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";
        return dateString.matches(NAME_REGEX);
    }

    /** Valida si el parámetro es una fecha con el formato "dd/MM/yyyy".
     * @return true si cumple el formato, false en caso contrario.
     */
    public static boolean isValidDate(String fechax) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fechax);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static boolean containsSpaces(String user) {
        boolean state = true;
        if (user.contains(" ")){
            state = false;
        }
        return state;
    }
}
