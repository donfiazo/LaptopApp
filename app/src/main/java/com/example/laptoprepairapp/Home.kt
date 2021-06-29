package com.example.laptoprepairapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {

    private lateinit var continueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        continueButton = findViewById(R.id.continueButton)

        continueButton.setOnClickListener {
            var intent = Intent(this, Signup::class.java)

            startActivity(intent)
        }

    }
}