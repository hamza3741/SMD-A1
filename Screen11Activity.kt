package com.hamzakhalid.i210704

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.hamzakhalid.integration.R

class Screen11Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen11)
        val arrow_back11 = findViewById<ImageView>(R.id.arrow_back11)
        arrow_back11.setOnClickListener{
            startActivity(Intent(this, Screen10Activity::class.java))
        }
    }
}
