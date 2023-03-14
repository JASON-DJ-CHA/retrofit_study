package com.jason.example.test_weather.Common;

import android.location.Location;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Common {
    public static final String APP_ID = "c222672c03b1611b6eb70c6cee7ee9ea";



    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = sdf.format(date);

        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);

        return formatted;

    }
}
