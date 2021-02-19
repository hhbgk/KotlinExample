package com.bob.kotlin.example.tutorial2.bean

import android.util.Log

/**
 * Des:
 * Author: Bob
 * Date:21-2-19
 * UpdateRemark:
 */
class Student(var score: Float, age:Int) : Person(age) {

    init {
        Log.w(tag, "init, age :$age, score:$score")
    }

    override fun eat() {
        super.eat()
        Log.e(tag, "eat apple")
    }

    override fun move() {
        Log.e(tag, "move away")
    }

    override fun doSomething() {
        Log.e(tag, "Play game")
    }

    override fun toString(): String {
        return super.toString() + ", score:$score"
    }
}