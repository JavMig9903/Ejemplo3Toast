package com.example.ejemplotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.ejemplotoast.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edt = findViewById<EditText>(R.id.edt1)
        val bot = findViewById<Button>(R.id.button1)

        bot.setOnClickListener {
            Toast.makeText(this@MainActivity,edt.text.toString(),Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            Toast.makeText(this@MainActivity,edt2.text.toString(),Toast.LENGTH_LONG).show()
        }

        binding.button3.setOnClickListener {
            Toast.makeText(this@MainActivity,edt3.text.toString(),Toast.LENGTH_LONG).show()
        }

    }
}