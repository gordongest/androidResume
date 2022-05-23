package com.gordongest.resume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var experience = findViewById<Button>(R.id.exp_button)

        experience.setOnClickListener {
            var moveToExpActivity = Intent(getApplicationContext(), ExperienceActivity::class.java)
            startActivity(moveToExpActivity)
        }
    }
}