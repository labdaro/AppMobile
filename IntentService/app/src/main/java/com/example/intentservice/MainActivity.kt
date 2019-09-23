package com.example.intentservice

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var i:Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        i = Intent(this, MyService :: class.java)
    }

    fun startService(v: View) {
        startService(i)
    }

    fun stopService(v : View) {
        stopService(i)
    }
}
