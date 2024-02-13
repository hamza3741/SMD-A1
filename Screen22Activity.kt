package com.hamzakhalid.i210704

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.hamzakhalid.integration.R

class Screen22Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen22)
        val arrow_back22 = findViewById<ImageView>(R.id.arrow_back22)
        arrow_back22.setOnClickListener{
            setContentView(R.layout.fragment_screen21) // Use screen16.xml layout directly
            // Perform fragment transaction to replace frame_container with Screen16 fragment
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_container, Screen21())
            fragmentTransaction.commit()
        }
        val spinnerCountry: Spinner =findViewById(R.id.spinnerCountry)
        // Step 1: Define the list of countries
        val countries = arrayOf("Pakistan", "United Arab Emirates","Saudi Arabia", "USA", "UK")

        // Step 2: Create an ArrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)

        // Step 3: Set the dropdown layout style
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Step 4: Set the adapter to the Spinner
        spinnerCountry.adapter = adapter

        val spinnerCity: Spinner =findViewById(R.id.spinnerCity)
        // Step 1: Define the list of countries
        val cities = arrayOf("Islamabad", "Karachi","Lahore", "Peshawar", "Quetta")

        // Step 2: Create an ArrayAdapter
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item,cities)

        // Step 3: Set the dropdown layout style
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Step 4: Set the adapter to the Spinner
        spinnerCity.adapter = adapter2
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}
