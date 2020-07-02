package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val trueName: String = "Baha"
    val lastName1: String = "Chan"

    val truelogin = "League"
    val truePassword = "4551"


    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Login = findViewById<EditText>(R.id.Login)
        val password = findViewById<EditText>(R.id.password)

        val reg = findViewById<Button>(R.id.Reg)

        reg.setOnClickListener {
            val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)


        }
        val sign = findViewById<Button>(R.id.log)

        sign.setOnClickListener {
            val sig = Intent(applicationContext, ProfileActivity::class.java)
            val loginText = Login.text.toString()
            val passwordText = password.text.toString()




            if (loginText == truelogin && passwordText == truePassword) {
                Toast.makeText(applicationContext, "Вход выполнен", Toast.LENGTH_LONG).show()
                sig.putExtra("trueName", trueName)
                sig.putExtra("lastName", lastName1)
                startActivity(sig)

            }
            else {
                Toast.makeText(applicationContext, "Неправильный Пароль или Логин", Toast.LENGTH_LONG).show()
            }





        }
    }
}






