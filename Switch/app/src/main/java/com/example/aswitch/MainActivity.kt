package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch.setOnCheckedChangeListener { _, isCheck -> {
            if (isCheck){
              Toast.makeText(this,"This is a toast message",Toast.LENGTH_LONG).show()

            }

        }
        } }
}
