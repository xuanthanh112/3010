package com.example.bai1_30_10

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Bai3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai3)

        val backButton = findViewById<Button>(R.id.buttonBack)
        backButton.setOnClickListener {
            finish()
        }

        val submitButton = findViewById<Button>(R.id.buttonSubmit)
        submitButton.setOnClickListener {
            val mssv = findViewById<EditText>(R.id.editTextMSSV).text.toString()
            val name = findViewById<EditText>(R.id.editTextName).text.toString()
            val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
            val phone = findViewById<EditText>(R.id.editTextPhone).text.toString()
            val agreeCheckbox = findViewById<CheckBox>(R.id.checkboxAgree)

            if (mssv.isEmpty() || name.isEmpty() || email.isEmpty() || phone.isEmpty() || !agreeCheckbox.isChecked) {
                Toast.makeText(this, "Please fill all fields and agree to terms", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Form submitted successfully!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
