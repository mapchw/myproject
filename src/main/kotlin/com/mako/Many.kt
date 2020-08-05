package com.mako

fun main() {
    val list = listOf(4, 3, 7, 8)
    println(list)
    val scores = listOf(80, 68, 46, 100, 98)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))

    //可寫入的
    var mutableList = mutableListOf(5, 1, 2, 7)
    println(mutableList)
    mutableList.add(6)
    println(mutableList)
}