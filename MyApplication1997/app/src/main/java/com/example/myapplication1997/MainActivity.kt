package com.example.myapplication1997

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var id:EditText
    lateinit var Login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.UserName)
        id = findViewById(R.id.UserId)
        Login = findViewById(R.id.button1)
        Login.setOnClickListener {
            Toast.makeText(applicationContext,name.text.toString(),Toast.LENGTH_SHORT)
                .show()
        }
    }

    fun getApiList(){
        val apiInterface:ApiInterface=RetrofitClient().apiInterface
        val apiCall=apiInterface.getMarvel()
        apiCall.enqueue(object : Callback<List<ResultResponse>>,
            retrofit2.Callback<List<ResultResponse>> {
            override fun onResponse(
                call: retrofit2.Call<List<ResultResponse>>,
                response: Response<List<ResultResponse>>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: retrofit2.Call<List<ResultResponse>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}