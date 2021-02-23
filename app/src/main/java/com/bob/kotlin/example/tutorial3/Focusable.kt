package com.bob.kotlin.example.tutorial3

import android.util.Log

/**
 * Des:
 * Author: Bob
 * Date:21-2-22
 * UpdateRemark:
 */
interface Focusable {
    fun setFocusable(b : Boolean) {
        Log.e(javaClass.simpleName, "setFocusable $b")
    }
    fun showOff() {
        Log.e(javaClass.simpleName, "I'm focusable!")
    }
}