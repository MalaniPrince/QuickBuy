package com.example.quickbuy.ui.base

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.quickbuy.R
import com.example.quickbuy.ui.home.HomeMainActivity
import com.example.quickbuy.utils.PreferenceHelper


class SplashActivity : AppCompatActivity() {
    private val splashTime: Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            if(PreferenceHelper.isUserLoggedIn(this)){
                startActivity(Intent(this,HomeMainActivity::class.java))
            }
            else{
                val intent = Intent(this@SplashActivity, OnBoardingActivity::class.java)
                startActivity(intent)
            }
            finish()
        }, splashTime)
    }
}