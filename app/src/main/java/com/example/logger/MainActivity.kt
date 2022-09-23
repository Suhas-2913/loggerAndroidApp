package com.example.logger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
    fun functionclicked(view: View){
        var displaytext: TextView = findViewById(R.id.textView7)
        displaytext.setText("Appointments")
    }
    fun functionclicked1(view: View){
        var displaytext: TextView = findViewById(R.id.textView7)
        displaytext.setText("timelines")
    }
}