package com.gordongest.resume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton = findViewById<Button>(R.id.about_button)
        aboutButton.setOnClickListener {
            val moveToAboutActivity = Intent(applicationContext, AboutActivity::class.java)
            startActivity(moveToAboutActivity)
        }

        val experienceButton = findViewById<Button>(R.id.exp_button)
        experienceButton.setOnClickListener {
            val moveToExpActivity = Intent(applicationContext, ExperienceActivity::class.java)
            startActivity(moveToExpActivity)
        }

        val educationButton = findViewById<Button>(R.id.edu_button)
        educationButton.setOnClickListener {
            val moveToEduActivity = Intent(applicationContext, EducationActivity::class.java)
            startActivity(moveToEduActivity)
        }

        val contactButton = findViewById<Button>(R.id.contact_button)
        contactButton.setOnClickListener {
            val TO = arrayOf("gordon.gest@gmail.com")
            val SUBJECT = "Great resume! We'd love to work with you :)"

            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, TO)
                putExtra(Intent.EXTRA_SUBJECT, SUBJECT)
            }

            startActivity(emailIntent)
        }
    }
}