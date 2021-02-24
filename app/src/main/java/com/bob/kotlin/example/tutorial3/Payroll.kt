package com.bob.kotlin.example.tutorial3

import android.util.Log
import com.bob.kotlin.example.tutorial2.bean.Person

/**
 * Des:
 * Author: Bob
 * Date:21-2-23
 * UpdateRemark:
 */
object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            Log.w(javaClass.simpleName, "index=${person.name}")
        }
    }
}