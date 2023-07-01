package com.example.youtubeclasses

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class second3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second3)

        val userName = intent.getStringExtra("USER")
        val textView =  findViewById<TextView>(R.id.text3)
        var score =  findViewById<TextView>(R.id.scoreInABC)
        val message = "Your overall score is $userName"
        val num: Int = userName!!.toInt()
        val result = when{
            64 <num && num < 87 -> "C1"
            50 <num && num < 65 -> "B2"
            37 <num && num < 51 -> "B1"
            else -> "Less than B1"
        }

        val color: String = when {

            result =="C1" -> "#FFEB3B"
            result =="B2" -> "#4CAF50"
            result =="B1" -> "#FF5722"
            result == "Less than B1" -> "#F40202"
            else -> "#F40202"
        }
        score.text = result
        println(score.textColors)
        println(color)
        score.setTextColor(Color.parseColor(color))
        textView.text = message

    }
}


