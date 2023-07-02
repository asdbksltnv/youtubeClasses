package com.example.youtubeclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.youtubeclasses.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)

    }
}