package com.bob.kotlin.example.tutorial1

import android.os.Bundle
import android.util.Log
import com.bob.kotlin.example.BaseActivity
import com.bob.kotlin.example.R

class VariableActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 定义只读局部变量使用关键字 val 定义。只能为其赋值一次
        val a: Int = 2
        val b = 3
        val c: Int
        c = 4;
        Log.i(tag, "a=$a, b=$b, c=$c")
        // 可重新赋值的变量使用 var 关键字：
        var x = 5 // 自动推断出 `Int` 类型
        x += 1
        Log.i(tag, "x=$x")

        // NULL检查机制
        var age: String? = "22"
        age = null
//        val myAge = age!!.toInt()// 抛出空指针异常
//        val myAge = age?.toInt()// or: 不做处理返回 null
        val myAge = age?.toInt() ?: -1// or: age为空返回-1
        Log.i(tag, "myAge=$myAge")

        val str = "33";
        Log.i(tag, "toInt=" + toInt(str) + ", String Length=" + getStringLength(str))
    }

    // 当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null
    private fun toInt(str: String): Int? {
        if (str.isEmpty()) {
            return null
        }
        return str.toInt()
    }

    // 类型检测及自动类型转换
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 做过类型判断以后，obj会被系统自动转换为String类型
            return obj.length
        }

        //在这里还有一种方法，与Java中instanceof不同，使用!is
        // if (obj !is String){
        //   // XXX
        // }

        // 这里的obj仍然是Any类型的引用
        return null
    }
}