package com.example.myapplication1997

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class FragmentMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_main2)
        loadfragment(FragmentClass())
    }
    fun loadfragment(fragment: Fragment){
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frgmentView, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}



