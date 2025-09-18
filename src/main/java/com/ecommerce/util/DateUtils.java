package com.ecommerce.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter DATE_FORMATED = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static String formatDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        return dateTime.format(DATE_FORMATED);
    }
}

