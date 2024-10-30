package com.example.bai1_30_10

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Bai1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai1)

        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val radioEven = findViewById<RadioButton>(R.id.radioEven)
        val radioOdd = findViewById<RadioButton>(R.id.radioOdd)
        val radioSquare = findViewById<RadioButton>(R.id.radioSquare)
        val buttonShow = findViewById<Button>(R.id.buttonShow)
        val listView = findViewById<ListView>(R.id.listView)
        val backButton = findViewById<Button>(R.id.buttonBack)

        backButton.setOnClickListener { finish() }

        buttonShow.setOnClickListener {
            val numberText = editTextNumber.text.toString()
            if (numberText.isEmpty()) {
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val n = numberText.toInt()
            val resultList = mutableListOf<Int>()

            when {
                radioEven.isChecked -> for (i in 0..n) if (i % 2 == 0) resultList.add(i)
                radioOdd.isChecked -> for (i in 0..n) if (i % 2 != 0) resultList.add(i)
                radioSquare.isChecked -> for (i in 0..n) if (Math.sqrt(i.toDouble()) % 1 == 0.0) resultList.add(i)
            }

            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, resultList)
            listView.adapter = adapter
        }
    }
}
