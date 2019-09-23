package com.example.brainquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        setTitle("Categories")


        general.setOnClickListener {

           var general = Intent(this,GeneralKnowledge::class.java)
            startActivity(general)
        }

        program.setOnClickListener {
            var programAct = Intent(this,programming::class.java)
            startActivity(programAct)
        }

        sport.setOnClickListener {
          var sport  = Intent(this,Sport::class.java)
            startActivity(sport)
        }

    }
}
