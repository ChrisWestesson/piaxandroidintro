package com.example.piaxintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var thenumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thetext = findViewById<TextView>(R.id.fancyHeaderText)

        thetext.text = "Hurra! Ändrad text"

        val thebutton = findViewById<Button>(R.id.fancyClickButton)

        val othertext = findViewById<TextView>(R.id.theCenterText)

        thebutton.setOnClickListener {

           // thenumber = thenumber + 1
            thenumber += 1

            thetext.text = "Klickat knapp " + thenumber.toString()
            othertext.text = "Bye bye"
        }

    }




}