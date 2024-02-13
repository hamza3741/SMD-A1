package com.hamzakhalid.i210704

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.hamzakhalid.integration.R


class Screen14 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_screen14, container, false)

        // Find the TextView
        val textJohnCooper1 = view.findViewById<TextView>(R.id.textJohnCooper1)

        // Set OnClickListener
        textJohnCooper1.setOnClickListener {
            // Replace current fragment with Screen15
            replaceFragment(Screen15())
        }

        val image_profile1Icon = view.findViewById<ImageView>(R.id.image_profile1)
        image_profile1Icon.setOnClickListener {
            // Replace current fragment with Screen16
            replaceFragment(Screen16())
        }
        val arrowBack = view.findViewById<ImageView>(R.id.arrow_back14)

        // Set OnClickListener to the arrow_back9 icon
        arrowBack.setOnClickListener {
            // Create an intent to start Screen18 activity
            val intent = Intent(activity, Screen7Activity::class.java)
            startActivity(intent)
        }

        return view
    }
    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.frame_container, fragment)
            .addToBackStack(null)
            .commit()
    }
    fun onSendButtonClick(view: View) {
        // Your code to handle the button click goes here
    }
}