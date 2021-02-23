package com.bob.kotlin.example.tutorial3

import android.os.Bundle
import android.util.Log
import com.bob.kotlin.example.BaseActivity
import com.bob.kotlin.example.R

/**
 * Des:
 * Author: Bob
 * Date:21-2-22
 * UpdateRemark:
 */
class FunctionActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val set = hashSetOf(1, 3, 53)
        val list = arrayListOf(1, 3, 53)
        val map = hashMapOf(1 to "one", 3 to "three", 53 to "fifty-three")
        Log.i(tag, "last element=" + set.last() + ", max=" + set.max())
        val result = joinToString(set, separator = ";", prefix = "{", postfix = "}")
        Log.e(tag, "result=$result")

        Log.e(tag, "list=" + list.joinToString(" "))

        val button = MyButton()
        button.click()
        button.showOff()

        val client1 = Client("Tom", 123)
        val client2 = Client("Tom", 123)

        val processed = hashSetOf(client1)
        Log.w(tag, "client1 == client2:" + (client1 == client2)// 由equals()决定
                + ", contain:" + processed.contains(client2)) //由equals()、hashCode()决定

        val client3 = DataClient("Tom", 123)
        val client4 = DataClient("Tom", 123)

        val processed2 = hashSetOf(client3)
        Log.e(tag, "client3 == client4:" + (client3 == client4)
                + ", contain:" + processed2.contains(client4) + ", client=" + client3)
    }

    private fun <T> joinToString(collection:Collection<T>, separator :String = ", ", prefix:String = "[", postfix: String = "]") : String{
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(element)
        }

        result.append(postfix)
        return result.toString()
    }
}