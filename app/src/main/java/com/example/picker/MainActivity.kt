package com.example.picker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.textView)
        val number = findViewById<NumberPicker>(R.id.number)
        val names = resources.getStringArray(R.array.man_names)
        number.minValue=0
        number.maxValue=4
        number.displayedValues = names
        number.setOnValueChangedListener { picker, oldVal, newVal ->  text.text=getText(R.string.text_expression)}



        }
    }

