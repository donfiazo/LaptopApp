package com.example.laptoprepairapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laptoprepairapp.R

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