package com.gordongest.resume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton = findViewById<Button>(R.id.about_button)
        aboutButton.setOnClickListener {
            println("about")
        }

        val experienceButton = findViewById<Button>(R.id.exp_button)
        experienceButton.setOnClickListener {
            val moveToExpActivity = Intent(getApplicationContext(), ExperienceActivity::class.java)
            startActivity(moveToExpActivity)
        }

        val educationButton = findViewById<Button>(R.id.edu_button)
        educationButton.setOnClickListener {
            println("booklearnin'")
        }

        val contactButton = findViewById<Button>(R.id.contact_button)
        contactButton.setOnClickListener {
            println("ding")
        }
    }
}