package com.example.quickbuy.ui.base

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.quickbuy.databinding.ActivityOnBoardingBinding
import com.example.quickbuy.ui.home.HomeMainActivity
import com.example.quickbuy.ui.login.LoginActivity

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.OnboardingButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}