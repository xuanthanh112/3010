package com.example.bai1_30_10

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Bai2Activity : AppCompatActivity() {

    private val studentList = listOf(
        "Nguyen Van A - 123456",
        "Tran Thi B - 654321",
        "Le Van C - 112233",
        "Pham Thi D - 445566",
        "Vo Van E - 778899",
        "Hoang Thi F - 223344",
        "Dang Van G - 556677",
        "Ly Thi H - 889900",
        "Ngo Van I - 332211",
        "Trieu Thi J - 665544"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai2)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)
        val listView = findViewById<ListView>(R.id.listView)
        val backButton = findViewById<Button>(R.id.buttonBack)

        backButton.setOnClickListener { finish() }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, studentList)
        listView.adapter = adapter

        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val filteredList = studentList.filter {
                    it.contains(s.toString(), ignoreCase = true)
                }
                listView.adapter = ArrayAdapter(this@Bai2Activity, android.R.layout.simple_list_item_1, filteredList)
            }
        })
    }
}
