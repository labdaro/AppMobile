package com.example.startactivityforresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var getNumber = intent.getStringExtra("Number")
        show.text = getNumber


        button.setOnClickListener {
            var intent = Intent()
            intent.putExtra("numberBack",getNumber)
            setResult(Activity.RESULT_OK,intent)
            finish()

        }


    }
}
