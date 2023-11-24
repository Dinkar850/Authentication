package com.example.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.authentication.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //creating a delay for our intent
        Handler(Looper.getMainLooper()).postDelayed({
            //define a variable for intent passing
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            //passing intent
            startActivity(intent)
            //back button doesn't bring the previous activity back again
            finish()
        }, 3000)
    }
}