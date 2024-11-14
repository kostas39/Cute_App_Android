package com.example.cute_app

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cute_app.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declare the views
        val dogIcon = findViewById<ImageView>(R.id.dogIcon)
        val capybaraIcon = findViewById<ImageView>(R.id.capybaraIcon)
        val catsIcon = findViewById<ImageView>(R.id.catsIcon)
        val instructionsText = findViewById<TextView>(R.id.instructionsText)
        val clearButton = findViewById<Button>(R.id.clearButton)

        // Click listeners for the icons
        dogIcon.setOnClickListener {
            updateMessage(instructionsText, clearButton, "You clicked on the cute dog!", "#FF00FF")
        }

        capybaraIcon.setOnClickListener {
            updateMessage(instructionsText, clearButton, "You clicked on the capybara!", "#FF8C00")
        }

        catsIcon.setOnClickListener {
            updateMessage(instructionsText, clearButton, "You clicked on the group of cute cats!", "#00BFFF")
        }

        // Click listener for the clear button
        clearButton.setOnClickListener {
            resetMessage(instructionsText, clearButton)
        }
    }

    // Function to update the message and button color
    private fun updateMessage(messageText: TextView, clearButton: Button, message: String, color: String) {
        messageText.text = message
        messageText.setTextColor(Color.parseColor(color))
        clearButton.setBackgroundColor(Color.parseColor(color)) // Set button background color
        clearButton.visibility = View.VISIBLE
    }

    // Function to reset the message and hide the button
    private fun resetMessage(messageText: TextView, clearButton: Button) {
        messageText.text = "Please Touch on one of the animal icons"
        messageText.setTextColor(Color.BLACK)
        clearButton.setBackgroundColor(Color.LTGRAY) // Reset button color to default
        clearButton.visibility = View.GONE
    }
}

