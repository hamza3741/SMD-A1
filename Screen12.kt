package com.hamzakhalid.i210704

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.hamzakhalid.integration.R

// TODO: Rename parameter arguments, choose names that match

class Screen12 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_screen12, container, false)

        val arrowBack = view.findViewById<ImageView>(R.id.arrow_back12)

        // Set OnClickListener to the arrow_back9 icon
        arrowBack.setOnClickListener {
            // Create an intent to start Screen18 activity
            val intent = Intent(activity, Screen7Activity::class.java)
            startActivity(intent)
        }
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the button by ID
        val uploadPhotoButton: Button = view.findViewById(R.id.btnUploadPhoto1)

        // Set click listener for the button
        uploadPhotoButton.setOnClickListener {
            // Create an intent to start Screen17 activity
            val intent = Intent(activity, Screen17Activity::class.java)
            startActivity(intent)
        }
        val uploadVideoButton: Button = view.findViewById(R.id.btnUploadVideo1)
        uploadVideoButton.setOnClickListener {
            // Create an intent to start Screen18 activity
            val intent = Intent(activity, Screen18Activity::class.java)
            startActivity(intent)
        }
    }

}