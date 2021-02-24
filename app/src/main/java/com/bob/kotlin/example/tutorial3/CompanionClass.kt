package com.bob.kotlin.example.tutorial3

import android.util.Log

/**
 * Des:类似Java 静态方法
 * Author: Bob
 * Date:21-2-23
 * UpdateRemark:
 */
class CompanionClass {
    companion object {
        fun bar() {
            Log.w("CompanionClass", "Companion object called")
        }

        fun foo() {
            Log.w("CompanionClass", "Companion object called foo")
        }
    }
}