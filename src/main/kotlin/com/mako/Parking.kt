package com.mako

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    println("費率(小時)： ${Car.getHourRate()}元")
    val enter = LocalDateTime.of(2020, 10, 12, 13, 42, 1)
    val leave = LocalDateTime.of(2020, 10, 12, 15, 56, 15)
    val car = Car("UC-0096", enter)
    println("進場時間： $enter")
    car.leave_time = leave
    println("離開時間： $leave")
    println("停留時間： ${car.getDurationMinutes()}分鐘")
    println("需付金額： ${car.calcParkingFee(car.getDurationMinutes())}元")
}

class Car(private val id: String, private val enter_time: LocalDateTime) {
    companion object {
        private val rate: Int = 30
        fun getHourRate(): Int = rate
    }

    var leave_time: LocalDateTime? = null
        set(value) {
            if (enter_time.isBefore(value)) {
                field = value //不能使用this.leave_time，因為又會進入set(value){}方法的執行區塊中，將會形成無窮迴圈，此處須使用field代表this.leave_time
            }
        }

    fun getDurationMinutes(): Long = Duration.between(enter_time, leave_time).toMinutes()

    fun calcParkingFee(minutes: Long): Long {
        return Math.ceil(minutes/60.0).toLong() * rate
    }
}