package com.example.kotlinpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinpatterns.facadepattern.facade.UserManager
import java.util.UUID

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userManager = UserManager()
        val user = userManager.getUser(UUID.randomUUID())
    }
}