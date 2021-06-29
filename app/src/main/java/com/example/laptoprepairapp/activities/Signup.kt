package com.example.laptoprepairapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laptoprepairapp.MainActivity
import com.example.laptoprepairapp.R

class Signup : AppCompatActivity() {

    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        submitButton = findViewById(R.id.submitButton)
        
        submitButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

    }
}