package com.example.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import eu.tutorials.quizapp.Constants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName: EditText = findViewById(R.id.etName)
        val startBtn: Button = findViewById(R.id.startBtn)

        startBtn.setOnClickListener{
            if(etName.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG)
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}