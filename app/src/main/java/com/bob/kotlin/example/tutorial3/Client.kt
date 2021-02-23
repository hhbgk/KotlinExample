package com.bob.kotlin.example.tutorial3

/**
 * Des:
 * Author: Bob
 * Date:21-2-23
 * UpdateRemark:
 */
class Client(val name:String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client) return false
        return name == other.name && postalCode == other.postalCode;
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }


}