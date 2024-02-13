package com.hamzakhalid.i210704

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.hamzakhalid.integration.R

class Screen10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen10)
        var btn1 = findViewById<Button>(R.id.ReviewBtn)
        btn1.setOnClickListener{
            startActivity(Intent(this, Screen11Activity::class.java))
        }
        var btn2 = findViewById<Button>(R.id.BookSessBtn)
        btn2.setOnClickListener{
            startActivity(Intent(this, Screen13Activity::class.java))
        }
        var btn3 = findViewById<Button>(R.id.JoinCommunityBtn)
        btn3.setOnClickListener{
            setContentView(R.layout.fragment_screen16) // Use screen16.xml layout directly
            // Perform fragment transaction to replace frame_container with Screen16 fragment
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_container, Screen16())
            fragmentTransaction.commit()
        }
        val arrowBack = findViewById<ImageView>(R.id.arrow_back10)
        // Set OnClickListener to the arrow_back9 icon
        arrowBack.setOnClickListener {
            startActivity(Intent(this, Screen7Activity::class.java))
        }
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}
