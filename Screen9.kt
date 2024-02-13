package com.hamzakhalid.i210704

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.hamzakhalid.integration.R


class Screen9 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_screen9, container, false)
        // Find the arrow_back9 icon by its ID
        val arrowBack = view.findViewById<ImageView>(R.id.arrow_back9)

        // Set OnClickListener to the arrow_back9 icon
        arrowBack.setOnClickListener {
            // Replace the current fragment with the Screen8 fragment
            replaceFragment(Screen8())
        }
        return view
    }
    private fun replaceFragment(fragment: Fragment){
        // Perform fragment transaction to replace the current fragment with the Screen8 fragment
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment)
        transaction.addToBackStack(null) // Add to back stack to enable back navigation
        transaction.commit()
    }
}