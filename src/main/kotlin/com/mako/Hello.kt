package com.mako

import com.mako.kotlin.Student

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
//    h.hello()



    var s1:String? = "abcd1234" //資料型態後加「?」表允需null
    s1 = null
    println(s1?.length) //若變數允許null，呼叫變數時也必須加「?」
    println(s1!!.get(3)) //「!!」表允須出現出錯，一般可能是編程人員希望能自己處理例外錯誤，故加「!!」同意程式執行下去
    println(s1?.substring(3))

    val h = Human(weight = 62.3f, height = 1.7f)
    println(h.bmi())

    val score = 88
    println(score > 60)
    val c : Char = 'A'
    println(c.toInt() > 60)
    val s : String = "12"
    println(s.toInt() > 12)
    /*var age = 21
    age = 24
    var weight = 60.3
    var height = 172.2f

    var name : String;
    name = "Mako"*/

}

class Human(var name: String = "", var weight: Float, var height: Float) {
    init {
        println("test... $weight")
    }
//    constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi(): Float {
        val bmi = weight / (height * height)

        return bmi
    }

    fun hello() {
        println("Hello Kotlin~!")
    }
}