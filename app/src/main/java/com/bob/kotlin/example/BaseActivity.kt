package com.bob.kotlin.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bob.kotlin.example.R

abstract class BaseActivity : AppCompatActivity() {
    protected val tag : String = javaClass.simpleName
}