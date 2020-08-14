package com.mako.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private static int rate = 30;
//    private long enter_time;
//    private long leave_time;
    private LocalDateTime enter_time;
    private LocalDateTime leave_time;

    /*public Car(String id, long enter_time) {
        this.id = id;
        this.enter_time = enter_time;
    }*/
    public Car(String id, LocalDateTime enter_time) {
        this.id = id;
        this.enter_time = enter_time;
    }

    //停車的停留時間(分鐘)
    public long getDurationMinutes() {
        Duration duration = Duration.between(enter_time, leave_time);

        return duration.toMinutes(); //計算分鐘數
    }

    //停車費率
    public static int getHourRate() {
        return rate;
    }

    //計算金額
    public long calcParkingFee(long minutes) {
        long hours = (long)Math.ceil(minutes/60.0); //Math.ceil()無條件進位，但型態仍為浮點數

        return hours * rate;
    }

    /*public void leaveTime() {
        leave_time = System.currentTimeMillis(); //System.currentTimeMillis()<=系統時間
    }*/
    public void leaveTime() {
        leave_time = LocalDateTime.now();
    }

    /*public void setLeaveTime(long leave_time) {
        if (leave_time > enter_time) {
            this.leave_time = leave_time;
        }
    }*/
    public void setLeaveTime(LocalDateTime leave_time) {
        if (leave_time.isAfter(enter_time)) {
            this.leave_time = leave_time;
        }
    }
}
