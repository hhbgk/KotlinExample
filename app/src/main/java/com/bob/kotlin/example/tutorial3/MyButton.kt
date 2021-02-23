package com.bob.kotlin.example.tutorial3

import android.util.Log

/**
 * Des:
 * Author: Bob
 * Date:21-2-22
 * UpdateRemark:
 */
class MyButton : Clickable , Focusable{
    private var value : String = "Hello"
    override fun click() {
        Log.e(javaClass.simpleName, "I was clicked!")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
        Log.w(javaClass.simpleName, "showOff...")
    }

    inner class InnerClass {
        fun getOuterReference() : String {
            this@MyButton.value += " world"
            return value
        }
    }

}