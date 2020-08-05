package com.mako

import java.util.*

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..5) {
        print("Please enter a number(ROUND=$i/5): ")
        var number = scanner.nextInt()
        println("第${i}次$number")
        if (number < secret) {
            println("Higher~")
        } else if (number > secret) {
            println("Lower~")
        } else {
            println("Great, the number is $secret")
            break
        }
    }
}