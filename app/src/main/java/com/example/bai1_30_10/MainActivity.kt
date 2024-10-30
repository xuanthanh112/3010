package com.example.bai1_30_10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBai1 = findViewById<Button>(R.id.buttonBai1)
        val buttonBai2 = findViewById<Button>(R.id.buttonBai2)
        val buttonBai3 = findViewById<Button>(R.id.buttonBai3)

        buttonBai1.setOnClickListener {
            startActivity(Intent(this, Bai1Activity::class.java))
        }

        buttonBai2.setOnClickListener {
            startActivity(Intent(this, Bai2Activity::class.java))
        }

        buttonBai3.setOnClickListener {
            startActivity(Intent(this, Bai3Activity::class.java))
        }
    }
}
