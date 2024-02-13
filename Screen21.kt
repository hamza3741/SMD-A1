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


class Screen21 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_screen21, container, false)
        val EditIcon1 = view.findViewById<ImageView>(R.id.EditIcon1)
        EditIcon1.setOnClickListener {
            val intent = Intent(context, Screen22Activity::class.java)
            startActivity(intent)
        }
        val EditIcon2 = view.findViewById<ImageView>(R.id.EditIcon2)
        EditIcon2.setOnClickListener {
            val intent = Intent(context, Screen22Activity::class.java)
            startActivity(intent)
        }
        val arrowBack = view.findViewById<ImageView>(R.id.arrow_back21)

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
        val BookedSessionsBtn: Button = view.findViewById(R.id.BookedSessionsBtn)

        // Set click listener for the button
        BookedSessionsBtn.setOnClickListener {
            // Create an intent to start Screen17 activity
            val intent = Intent(activity, Screen23Activity::class.java)
            startActivity(intent)
        }

    }
}