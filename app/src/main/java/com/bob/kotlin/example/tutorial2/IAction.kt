package com.bob.kotlin.example.tutorial2

import android.util.Log

/**
 * Des:
 * Author: Bob
 * Date:21-2-19
 * UpdateRemark:
 */
interface IAction {
    var gender:String //gender 属性, 抽象的
    fun eat() {
        Log.w("test", "Eating....");
    }
    fun move()
    fun doSomething()
}