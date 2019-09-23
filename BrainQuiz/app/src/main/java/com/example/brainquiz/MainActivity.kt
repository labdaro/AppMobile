package com.example.brainquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Register Account")
        button.setOnClickListener {
            var nation = ""
            var setGroup = groupCountry.checkedRadioButtonId
            when (setGroup) {
                R.id.Indai -> {
                    nation = "Indai"
                }
                R.id.Japanese -> {
                    nation = "Japan"

                }
                R.id.Cambodia -> {
                    nation = "Cambodia"
                }
            }
            var Gender = ""
            var checkGender = gender.checkedRadioButtonId
            when (checkGender) {
                R.id.Male -> {
                    Gender = "Male"
                }
                R.id.Female -> {
                    Gender = "Female"
                }
            }
            var NAME_INPUT = show.text.toString()
            var AGE_INPUT = age.text.toString()
            var NATION = nation
            var i = Intent(this,Main2Activity::class.java)
            i.putExtra("name",NAME_INPUT)
            i.putExtra("age",AGE_INPUT)
            i.putExtra("nation",NATION)
            i.putExtra("gender",Gender)
            startActivity(i)
        }
    }
}