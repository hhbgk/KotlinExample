package com.bob.kotlin.example.tutorial1

import android.os.Bundle
import android.util.Log
import com.bob.kotlin.example.BaseActivity
import com.bob.kotlin.example.R

class ControlActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val max: Int = getMax(5, 2)
        Log.i(tag, "max=$max")
        if (max in 1..10) {
            Log.i(tag, "max in 1-10")
        }
        when (max) {
            1 -> Log.i(tag, "max=$max")
            3 -> Log.i(tag, "max=$max")
            in 1..10 -> Log.i(tag,"$max is in the range")
            else -> Log.i(tag, "else max=$max")
        }

        val x = 10
        when {
            x > 2 -> Log.i(tag, "x is $x > 2")
            x < -2 -> Log.i(tag, "x is $x < -2")
            else -> Log.i(tag, "x is funny")
        }

        val items = listOf("apple", "banana", "kiwi")
        Log.i(tag, "list of :")
        for (item in items) {
            Log.i(tag, item)
        }

        for (index in items.indices) {
            Log.i(tag, "item at $index is ${items[index]}")
        }
    }

    private fun getMax(a: Int, b: Int): Int {
        return if (a > b) {
            Log.i(tag, "Choose a")
            a
        } else {
            Log.i(tag, "Choose b")
            b
        }
    }
}