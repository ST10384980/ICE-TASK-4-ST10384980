package com.example.icetask4imad5112st10384980

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val teams = arrayOf<String>("Ice", "Water", "Fire", "Light", "Steam", "Rock", "Air")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val teamsTextView = findViewById<TextView>(R.id.teamsTextView)

        var teamsDisplay = ""
        teamsDisplay += "${teams[0]}\n"
        teamsDisplay += "${teams[1]}\n"
        teamsDisplay += "${teams[2]}\n"
        teamsDisplay += "${teams[3]}\n"
        teamsDisplay += "${teams[4]}\n"
        teamsDisplay += "${teams[5]}\n"
        teamsDisplay += "${teams[6]}\n"


        teamsTextView.text = teamsDisplay
    }
}