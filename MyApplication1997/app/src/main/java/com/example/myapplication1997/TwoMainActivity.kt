package com.example.myapplication1997

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TwoMainActivity : AppCompatActivity() {
    lateinit var labelText :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_main)
        labelText =findViewById(R.id.txtName)
        if (intent.hasExtra("userName")){
            labelText.text=intent.getStringExtra("userName")
        }
    }
}