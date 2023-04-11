package com.example.demo.helper;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DemoHelper {

    public static int calculateDays(LocalDate dob) {
        LocalDate curDate = LocalDate.now();

        if ((dob != null) && (curDate != null)) {
            Period period = Period.between(dob, curDate);
            long years = period.getYears();
            long months = period.getMonths();
            long days = period.getDays();

            return (int) ((years * 365) + (months * 30) + days);
        } else {
            return 0;
        }
    }

    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();

        if ((dob != null) && (curDate != null)) {
            Period period = Period.between(dob, curDate);
            return Math.abs(period.getYears());
        } else {
            return 0;
        }
    }

    public static LocalDate stringToDate(String date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(date, formatter);
        } else {
            return null;
        }

    }
}
