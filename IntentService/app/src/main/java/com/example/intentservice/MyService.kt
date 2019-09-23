package com.example.intentservice

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Service is started", Toast.LENGTH_LONG).show()
        Thread.sleep(10000)
        Toast.makeText(this, "Task Over", Toast.LENGTH_LONG).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service is killed", Toast.LENGTH_LONG).show()
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
