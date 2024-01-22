package com.example.kotlinpatterns

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinpatterns.singletonpattern.Sun

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sun1: Sun? = null
        var sun2: Sun? = null
        findViewById<Button>(R.id.btnInstance1).setOnClickListener {
            sun1 = Sun.getInstance()
        }
        findViewById<Button>(R.id.btnInstance2).setOnClickListener {
            sun2 = Sun.getInstance()
        }
        findViewById<Button>(R.id.btnCheck).setOnClickListener {
            if (sun1 == sun2 && sun1 != null && sun2 != null)
                Toast.makeText(this, "Objects are the same", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Objects are not the same", Toast.LENGTH_SHORT).show()
        }
    }
}