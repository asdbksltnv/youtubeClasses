package com.example.youtubeclasses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textA = findViewById<TextView>(R.id.textView2)
        val writing = findViewById<EditText>(R.id.writingML)
        val reading = findViewById<EditText>(R.id.readingML)
        val speaking = findViewById<EditText>(R.id.speakingML)
        val listening = findViewById<EditText>(R.id.listeningML)
        val button = findViewById<Button>(R.id.button)
        val offersButton = findViewById<Button>(R.id.button2)
        var enteredName = ""

        button.setOnClickListener {
            textA.text = ""
            offersButton.visibility = INVISIBLE
            val arifAverage: Int = (writing.text.toString().toInt() + reading.text.toString().toInt() + speaking.text.toString().toInt() + listening.text.toString().toInt())/4


            enteredName = arifAverage.toString()



            if (enteredName == ""){
                val message = "Write your name"
                Toast.makeText(this@MainActivity, "Enter your name", Toast.LENGTH_LONG).show()
                textA.text = message
            }else{

                offersButton.visibility = VISIBLE
                val message = "Hello, $enteredName"
                textA.text = message

            }
        }

        offersButton.setOnClickListener{
            val intent = Intent(this, second3:: class.java)
            intent.putExtra("USER", enteredName)
            startActivity(intent )

        }
    }
}