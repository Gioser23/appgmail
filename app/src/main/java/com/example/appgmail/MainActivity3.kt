package com.example.appgmail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appgmail.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val buttonparavolver = binding.button3

        buttonparavolver.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }
    }
}