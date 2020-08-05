package com.mako.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("Mako", 80, 98)
    stu.print()
    var test = "aa11";
    println("Test is $test")
    println("High score: ${stu.highest()}")
    val stu2 = Student("Koby", 60, 62)
    stu2.print()
    val stu3 = Student("Timy", 55, 60)
    stu3.print()

    val gstu = GraduateStudent("Martin", 77, 70, 60)
    gstu.print()
}

class GraduateStudent(name: String?, english: Int, math: Int, var thesis: Int) : Student(name, english, math) {
    companion object {
        var pass = 70
    }

    //繼承覆寫
    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    //繼承覆寫
    override fun passOrFailed(): String = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name:String?, var english:Int, var math:Int) { //open==public，使類別可被繼承
    //伴生物件，類似static
    companion object {
        @JvmStatic
        var pass = 60;
        fun test() {
            println("testing~")
        }
    }

    open fun print() { //open開放方法，使方法可被繼承
        /*println(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" + passOrFailed()
        )
        println("\t" + grading())*/
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    internal fun grading(): Char = when(getAverage()) { //internal==module模組可用
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    fun getAverage() = (english + math)/2

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun nameCheck() = println(name?.length) //若參數可能會傳null，記得此處也加「?」
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    println("Please enter student's name:")
//    var name = scanner.next()
    var name = null
    println("Please enter student's english score:")
    var english = scanner.nextInt()
    println("Please enter student's math score:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}