package com.example.boundservice

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import java.util.*

class SreySa: Service() {

    inner class TevyBinder : Binder() {
        fun getSreysaObject(): SreySa {
            return this@SreySa
        }
    }

    inner class SothanakBinder: Binder(){
        fun message():String{
            return "Enna da"
        }
    }
    var tevyBinder: Binder = TevyBinder()
    override fun onBind(p0: Intent?): IBinder? {
        return tevyBinder

    }


    fun getBread(): String {
        return "I just use a Service"
    }

    fun getTime(): String {
        return Date().toString()
    }

}