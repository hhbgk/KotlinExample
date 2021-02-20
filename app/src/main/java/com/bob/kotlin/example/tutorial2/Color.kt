package com.bob.kotlin.example.tutorial2

/**
 * Des:
 * Author: Bob
 * Date:21-2-20
 * UpdateRemark:
 */
enum class Color(val r:Int, val g:Int, val b:Int) {
    RED(255, 0,0), ORANGE(255, 165, 0), YELLOW(255,255,0),
    GREEN(0,255,0), BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(239, 125, 235);

    fun rbg() : Int {
        return (r * 256 + g) * 256 + b
    }

    fun rbg1() = (r * 256 + g) * 256 + b

}