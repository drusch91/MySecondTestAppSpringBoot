package ru.example2.SecondTestAppSpringBoot.Util;

import java.time.LocalDateTime;

public class LeapYear {

    public static Integer check() {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int dayOfYear = 0;

        if (year % 100 == 0 && year % 400 == 0) {
            dayOfYear = 366;
        } else if (year % 100 == 0 && year % 400 != 0) {
            dayOfYear = 365;
        } else if (year % 4 == 0) {
            dayOfYear = 366;
        } else if (year % 4 != 0) {
            dayOfYear = 365;
        }
        return dayOfYear;
    }
}