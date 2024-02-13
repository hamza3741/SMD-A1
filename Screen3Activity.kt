package com.hamzakhalid.i210704

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.hamzakhalid.integration.R

class Screen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen3)
        var textViewLogIn2 = findViewById<TextView>(R.id.textViewLogIn2)
        textViewLogIn2.setOnClickListener{
            startActivity(Intent(this, Screen2Activity::class.java))
        }
        var SignUp1 = findViewById<Button>(R.id.SignUpBtn)
        SignUp1.setOnClickListener{
            startActivity(Intent(this, Screen4Activity::class.java))
        }
        val spinnerCountry: Spinner=findViewById(R.id.spinnerCountry)
        // Step 1: Define the list of countries
        val countries = arrayOf("Pakistan", "United Arab Emirates","Saudi Arabia", "USA", "UK")

        // Step 2: Create an ArrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)

        // Step 3: Set the dropdown layout style
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Step 4: Set the adapter to the Spinner
        spinnerCountry.adapter = adapter

        val spinnerCity: Spinner=findViewById(R.id.spinnerCity)
        // Step 1: Define the list of countries
        val cities = arrayOf("Islamabad", "Karachi","Lahore", "Peshawar", "Quetta")

        // Step 2: Create an ArrayAdapter
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item,cities)

        // Step 3: Set the dropdown layout style
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Step 4: Set the adapter to the Spinner
        spinnerCity.adapter = adapter2

        }
    }