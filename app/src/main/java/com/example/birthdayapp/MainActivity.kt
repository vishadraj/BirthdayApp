package com.example.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<Button>(R.id.button1)
        val editText = findViewById<EditText>(R.id.name)

        Button.setOnClickListener {
            val name = editText.editableText.toString();
            if (name.trim() == "") {
                Toast.makeText(this, "please input data", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this,BirthdayGreetingActivity::class.java)
                intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
                startActivity(intent)
            }
        }
    }

}