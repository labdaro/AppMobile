package com.example.sharepreferance

import android.content.Context

class MyPre(context:Context){
    var pref_name = "firstpref"
    var SCORE = "MyScore"
    var pref = context.getSharedPreferences(pref_name,Context.MODE_PRIVATE)

    fun getScore():Int{
        var score = pref.getInt(SCORE,0)
        return score+1
    }

    fun setScore(score:Int){
        val editor = pref.edit()
        editor.putInt(SCORE, score)
        editor.apply()

    }

}