package com.bob.kotlin.example.tutorial3

import android.util.Log

/**
 * Des:
 * Author: Bob
 * Date:21-2-22
 * UpdateRemark:
 */
interface Clickable {
    fun click()
    fun showOff() {
        Log.e(javaClass.simpleName, "I'm clickable!")
    }
}