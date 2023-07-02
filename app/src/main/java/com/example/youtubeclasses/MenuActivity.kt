package com.example.youtubeclasses

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youtubeclasses.databinding.ActivityMainBinding

class MenuActivity: AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)

    }

}