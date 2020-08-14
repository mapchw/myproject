package com.mako.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; //Calendar月份特性為0~11，欲取得真實月份須自行+1
        int day = now.get(Calendar.DAY_OF_MONTH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter year number: (" + year + ")");
            String yearString = reader.readLine(); //用BufferedReader的特性是只能得到字串
            year = (yearString.length() > 0) ? Integer.parseInt(yearString) : year; //yearString長度不為0，轉型成INT
            System.out.println("Year number is: " + year);

            System.out.print("Enter month number: (" + month + ")");
            String monthString = reader.readLine(); //用BufferedReader的特性是只能得到字串
            if (monthString.length() > 0) {
                month = Integer.parseInt(monthString); //轉型成INT
            }
            System.out.println("Month number is: " + month);

            System.out.print("Enter day number: (" + day + ")");
            String dayString = reader.readLine(); //用BufferedReader的特性是只能得到字串
            if (dayString.length() > 0) {
                day = Integer.parseInt(dayString); //轉型成INT
            }
            System.out.println("Day number is: " + day);

            int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int day_now = 0;
            for (int i = 0; i < month-1; i++) {
                day_now += months[i];
            }
            day_now += day;
            if (month > 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                day_now += 1;
            }
            System.out.println(day_now);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
