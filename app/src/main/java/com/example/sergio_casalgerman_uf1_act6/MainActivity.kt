package com.example.sergio_casalgerman_uf1_act6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val editText = findViewById<android.widget.EditText>(R.id.editText)
        val button = findViewById<android.widget.Button>(R.id.button)

        button.setOnClickListener {
            val text = editText.text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}