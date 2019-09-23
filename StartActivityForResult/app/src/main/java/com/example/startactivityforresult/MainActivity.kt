package com.example.startactivityforresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
        var inpNumber = inputNumber.text.toString()
        var intent = Intent(this,Main2Activity::class.java)
        intent.putExtra("Number",inpNumber)
        startActivityForResult(intent,100)}

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 100){
            var get = data?.getStringExtra("numberBack")
            textShow.text = get

        }
    }
}
