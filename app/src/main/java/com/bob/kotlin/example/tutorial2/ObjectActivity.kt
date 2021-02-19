package com.bob.kotlin.example.tutorial2

import android.os.Bundle
import android.util.Log
import com.bob.kotlin.example.BaseActivity
import com.bob.kotlin.example.R
import com.bob.kotlin.example.tutorial2.bean.Person
import com.bob.kotlin.example.tutorial2.bean.Student

/**
 * Des:
 * Author: Bob
 * Date:21-2-19
 * UpdateRemark:
 */
class ObjectActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p = Person(20, "Tom")
        p.name = "Hello"
        p.setWeight(55)
        Log.i(tag, "Person $p")
        p.gender = "male"
        p.eat()
        p.move()
        p.doSomething()

        val s = Student(88.8f, 13)
        s.score = 100.0f
        s.gender = "female"
        s.eat()
        s.move()
        s.doSomething()
        Log.w(tag, "Student= $s")
    }
}