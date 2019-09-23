package com.example.brainquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        setTitle("User")


        var name = intent.getStringExtra("sendName")
        var age =  intent.getStringExtra("sendAge")
        var gender = intent.getStringExtra("sendGender")
        var nation = intent.getStringExtra("sendNation")


        if (gender == "Male"){
            genderImage.setBackgroundResource(R.drawable.boy)
        }
        if (gender == "Female"){
            genderImage.setBackgroundResource(R.drawable.girl)
        }

        showName.text = "Name: $name"
        showAge.text = " Age : $age"
        showGender.text = "Gender : $gender"
        showNation.text = "Country: $nation"


    }
}
