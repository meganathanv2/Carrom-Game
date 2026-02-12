package com.mega.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDataTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today: " + date);
        System.out.println("Year : " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDayOfMonth());

        System.err.println("---Time ---");

        LocalTime time = LocalTime.now();

        System.out.println("Current time : " + time);
        System.out.println("hours :" + time.getHour());

        System.err.println("All ZoneId");
        // for(String str :ZoneId.getAvailableZoneIds()){
        // System.out.print(str+"--");

        // }
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime tomorrow = now.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow.getDayOfYear());

        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("india zoneid : " + india);

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/YY");
        String form=date.format(formatter);
        System.out.println("Formatted date :"+ form);

    }

}
