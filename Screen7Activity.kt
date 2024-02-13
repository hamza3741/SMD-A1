package com.hamzakhalid.i210704

import android.content.Intent
import android.widget.RelativeLayout
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hamzakhalid.integration.R

class Screen7Activity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen7)
        val relativeView = findViewById<RelativeLayout>(R.id.JohnCooperBox)  // Replace with your relative view ID
        relativeView.setOnClickListener {
            // Handle click event here
            openScreen10Activity()
        }
        val NotificationsIcon = findViewById<ImageView>(R.id.NotificationsIcon)
        NotificationsIcon.setOnClickListener{
            startActivity(Intent(this, Screen24Activity::class.java))
        }

        bottomNavigationView=findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.action_search -> {
                    replaceFragment(Screen8())
                    true
                }
                R.id.action_chat -> {
                    replaceFragment(Screen14())
                    true
                }
                R.id.action_upload-> {
                    replaceFragment(Screen12())
                    true
                }
                R.id.action_profile -> {
                    replaceFragment(Screen21())
                    true
                }

                else -> {false}
            }
        }
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commitAllowingStateLoss()
    }
    private fun openScreen10Activity() {
        val intent = Intent(this, Screen10Activity::class.java)
        startActivity(intent)
    }
}



