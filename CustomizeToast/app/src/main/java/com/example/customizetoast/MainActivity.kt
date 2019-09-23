package com.example.customizetoast

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener { _, b ->
            if (b) {
                textView.setBackgroundColor(Color.RED)
                textView.setOnClickListener {
                    var popUp = PopupMenu(this,it)
                    popUp.inflate(R.menu.mymenu)
                    popUp.show()
                    popUp.dismiss()
                }
            } else {
                textView.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
    fun demo(v : View) {
        var i = Intent(this, MyMusicService :: class.java)
        when(v.id) {
            R.id.start -> {
                startService(i)
            }
            R.id.stop -> {
                stopService(i)
            }
            R.id.startNew -> {
                startActivity(Intent(this, Main2Activity :: class.java))
            }
        }

    }
}
