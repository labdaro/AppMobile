package com.example.brainquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main4.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setTitle("Home")
        homeLayout.setBackgroundResource(R.drawable.pic)

        quiz.setOnClickListener {
            var quizButton = Intent(this, Main3Activity::class.java)
            startActivity(quizButton)
        }



        userpanel.setOnClickListener {

            var GET_NAME = intent.getStringExtra("name")// Get date from Activity 1
            var GET_AGE = intent.getStringExtra("age")
            var GET_GENDER = intent.getStringExtra("gender")
            var GET_NATION = intent.getStringExtra("nation")



            var userPanel = Intent(this, Main4Activity::class.java)
            userPanel.putExtra("sendName",GET_NAME)     // Send data the Activity4
            userPanel.putExtra("sendAge",GET_AGE)
            userPanel.putExtra("sendGender",GET_GENDER)
            userPanel.putExtra("sendNation",GET_NATION)
            startActivity(userPanel)
        }




    }
}
