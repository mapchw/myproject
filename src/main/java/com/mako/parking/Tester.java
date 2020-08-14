package com.mako.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        java();
//        java8();

        System.out.println("費率(小時)： " + Car.getHourRate() + "元");
        LocalDateTime enter = LocalDateTime.of(2020, 9, 12, 10,07,58);
        LocalDateTime leave = LocalDateTime.of(2020, 9, 12, 11, 46, 2);
//        Car car = new Car("UC-0079", enter.atZone(ZoneId.systemDefault()).toEpochSecond()); //enter.atZone(ZoneId.systemDefault()).toEpochSecond() 取得當前時區時間值
        Car car = new Car("UC-0079", enter);
        System.out.println("進場時間： " + enter);
        car.setLeaveTime(leave);
        System.out.println("離開時間： " + leave);
        System.out.println("停留時間： " + car.getDurationMinutes() + "分鐘");
        System.out.println("需付金額： " + car.calcParkingFee(car.getDurationMinutes()) + "元");
    }

    private static void java8() {
        //java8 later
        Instant indtant = Instant.now(); //Instant帶有時區概念
        System.out.println(indtant); //2020-08-13T08:18:22.661217700Z <-印出為格林威治時間

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //2020-08-13T16:18:22.661217700 <-印出為本地時間

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now)); //2020/08/13 16:18:22

        System.out.println(now.plus(Duration.ofHours(3))); //加3小時，2020-08-13T19:18:22.661217700，不會改變原本now的時間

        LocalDateTime other = LocalDateTime.of(2020, 10, 24, 14, 7,38); //直接指定時間
        System.out.println(other); //2020-10-24T14:07:38
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date); //Thu Aug 13 16:08:34 GMT+08:00 2020
        System.out.println(date.getTime()); //1597306114109

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date)); //2020/08/13 16:08:34
        String s = "2020/10/10 09:00:00";
        try {
            Date other = sdf.parse(s); //轉成日期物件
            System.out.println(other); //Sat Oct 10 09:00:00 GMT+08:00 2020
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar); //java.util.GregorianCalendar[time=1597306114151,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT+08:00",offset=28800000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=226,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=8,SECOND=34,MILLISECOND=151,ZONE_OFFSET=28800000,DST_OFFSET=0]
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime()); //Tue Oct 13 16:08:34 GMT+08:00 2020
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime()); //Fri Oct 16 16:08:34 GMT+08:00 2020
    }
}
