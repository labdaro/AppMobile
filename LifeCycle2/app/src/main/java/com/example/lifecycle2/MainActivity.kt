package com.example.lifecycle2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "On start",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy",Toast.LENGTH_LONG).show()
    }
}
