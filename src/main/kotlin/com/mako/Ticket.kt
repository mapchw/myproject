package com.kotlin

import java.util.*

data class Ticket(val origin: Int, val destination: Int, val price: Int)

fun main() {
    var ticket = Ticket(20, 51, 420)
    val s = "asdff"
    println(s.validate())
    println((1..10).random())
}

//Extensions 為任一class添加funtion但不用更改class原始碼
fun String.validate() : Boolean {
    return this.length >= 6
}

//Extensions
fun IntRange.random() : Int {
    val r = Random().nextInt(endInclusive-start)+start
    return r
}