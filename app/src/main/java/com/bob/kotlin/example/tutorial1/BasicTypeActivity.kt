package com.bob.kotlin.example.tutorial1

import android.os.Bundle
import android.util.Log
import com.bob.kotlin.example.BaseActivity
import com.bob.kotlin.example.R

class BasicTypeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a: Int = 10000
        // 三个等号 === 表示比较对象地址, 两个 == 表示比较两个值大小
        Log.w(tag, "a == a:" + (a == a) + ", a === a:" + (a === a)) // true，值相等，对象地址相等

        //经过了装箱，创建了两个不同的对象
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        //虽然经过了装箱，但是值是相等的，都是10000
        Log.w(tag,"(boxedA === anotherBoxedA)=" + (boxedA === anotherBoxedA)) //  false，值相等，对象地址不一样
        Log.w(tag,"(boxedA == anotherBoxedA)=" + (boxedA == anotherBoxedA)) // true，值相等

        val b: Byte = 1 // OK, 字面值是静态检测的
//        val i: Int = b // 错误
        val i: Int = b.toInt()// OK

        // 数组
        //[1,2,3]
        val array1 = arrayOf(1, 2, 3)
        for (i in array1) Log.w(tag,"x[$i]= $i")
        //[0,2,4]
        val array2 = Array(3, { i -> (i * 2) })

        //读取数组内容
        Log.w(tag, "array1[0] " + array1[0] + ", array2[1] " + array2[1])    // 输出结果：1, 2
        val x: IntArray = intArrayOf(1, 2, 3)
        x[0] = x[1] + x[2]
        Log.w(tag,"x[0]= ${x[0]}")
    }
}