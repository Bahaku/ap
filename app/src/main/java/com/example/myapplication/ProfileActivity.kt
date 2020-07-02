package com.example.myapplication


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profName = intent.getStringExtra("profName")
        val textView = findViewById<TextView>(R.id.Profile_name)
        textView.text = profName

        val lastName = intent.getStringExtra("lastName")
        val nameView = findViewById<TextView>(R.id.Profile_LastName)
        nameView.text= lastName

        val trueName = intent.getStringExtra("trueName")
        val viewName = findViewById<TextView>(R.id.Profile_name)
        viewName.text = trueName

        val truelastname = intent.getStringExtra("lastName")
        val viewLastName = findViewById<TextView>(R.id.Profile_LastName)
        viewLastName.text = truelastname
    }
}