package com.example.lesson4


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import com.example.lesson4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding  // ActivityMainBinding это тип разметки

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


    }


}