package com.example.sharedpreferences

import android.content.Context

class MyPref(context: Context) {

    val PREF_NAME = "firstpref"
    val SCORE = "MyScore"
    val pref = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE)

    fun getScore(): Int {
        var score = pref.getInt(SCORE,0)
        return score+1
    }
    fun setScore(score: Int){
        val editor = pref.edit()
        editor.putInt(SCORE,score)
        editor.apply()
    }
}