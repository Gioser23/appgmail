package com.example.appgmail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.appgmail.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val correocompleto = findViewById<TextView>(R.id.editTextText3)

        correocompleto.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)

            startActivity(intent)
        }

    }
}