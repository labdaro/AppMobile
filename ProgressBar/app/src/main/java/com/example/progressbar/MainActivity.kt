package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar2)
        if (progressBar != null) {
            val btn = findViewById<Button>(R.id.button)
            btn?.setOnClickListener {
                val visibility = if (progressBar2.visibility == View.GONE) View.VISIBLE else View.GONE
                progressBar2.visibility = visibility

                val btnText = if (progressBar2.visibility == View.GONE) "SHOW PROGRESSBAR" else "HIDE PROGRESSBAR"
                btn.text = btnText
            }
        }



        if( progressBar != null ) {
            button.setOnClickListener {
            // Visibility of Progress Bar
                progressBar.visibility = if(progressBar.visibility == View.GONE) View.VISIBLE else View.GONE
            // Display Text of the Button.
                button.text = if(progressBar.visibility == View.GONE) "Show ProgressBar" else "Hide the Progress Bar"

            }
        }
    }
}
