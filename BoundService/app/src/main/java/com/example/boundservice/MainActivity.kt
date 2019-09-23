package com.example.boundservice

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sreysaObject: SreySa? = null
    var vichea:Vichea? = null
    var scVichea = object : ServiceConnection{
        override fun onServiceDisconnected(p0: ComponentName?) {

        }

        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
            var chunneng = p1 as Vichea.ChunnengBinder
            vichea = chunneng.getVichea()
        }
    
    }
    var sc: ServiceConnection = object : ServiceConnection{
        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
            var tevyBinder = p1 as SreySa.TevyBinder
            sreysaObject = tevyBinder.getSreysaObject()
        }

        override fun onServiceDisconnected(p0: ComponentName?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = Intent(this, SreySa :: class.java)
        bindService(i,sc, Context.BIND_AUTO_CREATE)



















































































































































































































    }

    fun getbread(v: View) {
        textView.text = sreysaObject?.getBread()+vichea?.createMemes()

    }
}
