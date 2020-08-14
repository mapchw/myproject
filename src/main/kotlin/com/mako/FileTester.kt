package com.mako

import java.io.File

fun main() {
//    write()
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun write() {
//    File("output.txt").writeText("abcd1234")
//    File("output.txt").printWriter().use {
//        it.println("1st line")
//        it.println("2nd line")
//        it.println("3rd line")
//    }
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}