package com.example.quickbuy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quickbuy.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
      binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.OnboardingButton.setOnClickListener {
           startActivity(Intent(this,MainActivity::class.java))
       }
    }
}