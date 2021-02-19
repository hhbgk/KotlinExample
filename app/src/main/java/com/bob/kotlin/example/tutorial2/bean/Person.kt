package com.bob.kotlin.example.tutorial2.bean

import android.util.Log
import com.bob.kotlin.example.tutorial2.IAction

/**
 * Des:
 * Author: Bob
 * Date:21-2-19
 * UpdateRemark:
 */
open class Person constructor(myAge: Int) : IAction {
    val tag = javaClass.simpleName;

    constructor(myAge: Int, myName: String) : this(myAge) {
        this.name = myName
        Log.w(tag, "constructor....myAge=$myAge, my name=$name")
    }

    init {
        Log.w(tag, "init....myAge=$myAge")
    }

    var age: Int = myAge
        set(value) {
            field = value + 1
        }

    var name: String? = null
    private var weight: Int = 0

    fun getWeight(): Int {
        return weight
    }

    fun setWeight(w: Int) {
        weight = w
    }

    override var gender: String = "male"

    override fun move() {
        Log.i(tag, "moving......")
    }

    override fun doSomething() {
        Log.i(tag, "fighting......")
    }

    override fun toString(): String {
        return "age:$age, name:$name, weight:$weight, gender:$gender"
    }
}