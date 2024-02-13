package com.hamzakhalid.i210704

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.hamzakhalid.integration.R

class Screen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen2)
        var textViewForgotPassword = findViewById<TextView>(R.id.textViewForgotPassword)
        textViewForgotPassword.setOnClickListener{
            startActivity(Intent(this, Screen5Activity::class.java))
        }
        var Login1 = findViewById<Button>(R.id.LoginBtn)
        Login1.setOnClickListener{
            startActivity(Intent(this, Screen7Activity::class.java))
        }
        var textViewSignUp = findViewById<TextView>(R.id.textViewSignUp)
        textViewSignUp.setOnClickListener{
            startActivity(Intent(this, Screen3Activity::class.java))
        }
    }
}
