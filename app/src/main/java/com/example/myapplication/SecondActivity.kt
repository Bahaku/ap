package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val create = findViewById<Button>(R.id.create)
        val inputName = findViewById<EditText>(R.id.Name)
        val lastName = findViewById<EditText>(R.id.Last_name)


        create.setOnClickListener {
            val secondName = lastName.text.toString()
            val text = inputName.text.toString()
            val intent = Intent(applicationContext, ProfileActivity::class.java)
            intent.putExtra("profName", text)
            intent.putExtra("lastName", secondName)
            startActivity(intent)
        }

    }
}