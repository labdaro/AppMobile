package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.max = 500

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textView.text = "Current : $p1"
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                textView.text = "Start at $p0"
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                textView.text = "Finish at $p0"
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        } )
    }
}



/* This project was created to demonstrate the SeekBar */
