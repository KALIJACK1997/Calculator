package com.example.myapplication1997

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class OneMainActivity : AppCompatActivity() {
    lateinit var txtName:EditText
    lateinit var signIn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_main)
        txtName = findViewById(R.id.TxtEdit)
        signIn = findViewById(R.id.login)
        txtName.setOnClickListener {
            val redirectIntent = Intent(this,TwoMainActivity ::class.java)
            redirectIntent.putExtra("userName",txtName.text.toString())
            startActivity(redirectIntent)
        }
    }
}