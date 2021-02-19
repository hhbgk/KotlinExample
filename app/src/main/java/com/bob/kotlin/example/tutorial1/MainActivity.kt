package com.bob.kotlin.example.tutorial1

import android.os.Bundle
import android.util.Log
import com.bob.kotlin.example.BaseActivity
import com.bob.kotlin.example.R

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(tag, "sum=" + sum(2, 6))
        print(1, 3)
        manyParamsFun(1, 2, 3, 4, 5)  // 输出12345
        manyParamsFun2("a", "b", "c", "d", "e")

//        val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
        println(sumLambda(78, 2))  // 输出 3
    }

    // 函数定义
    private fun sum(a: Int, b: Int): Int {// Int 参数，返回值 Int
        return a + b
    }

    // 函数定义
    private fun print(a: Int, b: Int) {// Int 参数，无返回值
        Log.i(tag, "a=$a, b=$b")
    }

    // 可变长参数函数
    private fun manyParamsFun(vararg v: Int) {
        for (vt in v) {
            println(vt)
        }
    }

    // 可变长参数函数
    private fun manyParamsFun2(vararg v: String) {
        for (vt in v) {
            println(vt)
        }
    }

    // 匿名函数
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
}