package com.example.azkar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handler =Handler()
        handler.postDelayed({

         val intent = Intent(this,ContentActivity::class.java)
            startActivity(intent)
        },5000)
    }
}
