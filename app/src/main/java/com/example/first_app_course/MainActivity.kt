package com.example.first_app_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCountClick = findViewById<Button>(R.id.count_button)
        val textWelcomeToTotal = findViewById<TextView>(R.id.welcome_to_total)
        val textTotalClicks = findViewById<TextView>(R.id.view_total)
        var totalClicks = 0
        buttonCountClick.setOnClickListener{
            totalClicks += 1
            textTotalClicks.text = totalClicks.toString()
            textWelcomeToTotal.text = "Total Clicks:"
            Toast.makeText(this,"amo meu mo",Toast.LENGTH_LONG).show()
        }
    }
}