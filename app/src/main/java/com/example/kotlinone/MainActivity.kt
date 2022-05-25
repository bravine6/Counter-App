package com.example.kotlinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickme = findViewById<Button>(R.id.button1)
        val t1= findViewById<TextView>(R.id.textView)
        var t2 = 0
        btnClickme.setOnClickListener {
           // btnClickme.text= "HAHA YOU CLICKED ME"
            t2 += 1
            t1.text= t2.toString()
            Toast.makeText(this, "hello world", Toast.LENGTH_LONG).show()
        }
    }
}