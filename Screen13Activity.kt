package com.hamzakhalid.i210704

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.hamzakhalid.integration.R

class Screen13Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen13)
        val arrow_back13 = findViewById<ImageView>(R.id.arrow_back13)
        arrow_back13.setOnClickListener{
            startActivity(Intent(this, Screen10Activity::class.java))
        }
    }
}
