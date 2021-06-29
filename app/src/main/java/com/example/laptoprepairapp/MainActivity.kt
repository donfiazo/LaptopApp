package com.example.laptoprepairapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laptoprepairapp.activities.Home

class MainActivity : AppCompatActivity() {
    private lateinit var welcomeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeButton = findViewById(R.id.welcomeButton)

        welcomeButton.setOnClickListener {
            var intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}