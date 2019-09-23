package com.example.boundservice

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class Vichea : Service() {

    inner class ChunnengBinder:Binder(){
        fun getVichea():Vichea{
            return this@Vichea
        }
    }

    var chunneng = ChunnengBinder()
    override fun onBind(p0: Intent?): IBinder? {
        return chunneng
    }

    fun createMemes():String{
        return "New Meme..."
    }

}