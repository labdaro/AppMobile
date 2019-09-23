package com.example.brainquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.general_knowledge.*

class GeneralKnowledge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.general_knowledge)


        var timer= object:CountDownTimer(60000,1000){


            override fun onTick(millisUntilFinished: Long) {
                var timeLoad = millisUntilFinished/1000
               showTimer.text = "Time:$timeLoad"

            }
            override fun onFinish() { RESULT() }
        }
        timer.start()
    }

    private fun RESULT() {
        var resultQuiz = Intent(this,ResultScore::class.java)
        startActivity(resultQuiz)
    }
}
