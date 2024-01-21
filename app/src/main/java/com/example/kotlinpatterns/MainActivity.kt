package com.example.kotlinpatterns

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.example.kotlinpatterns.builderpattern.builder.CoffeeBuilder
import com.example.kotlinpatterns.builderpattern.builder.Director

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val director = Director()
        val builder = CoffeeBuilder()
        director.setBuilder(builder)
         findViewById<Button>(R.id.btnCoffee).setOnClickListener {
             director.makeCoffee()
             Toast.makeText(this, builder.getCoffee().showCompound(), Toast.LENGTH_SHORT).show()
         }
        findViewById<Button>(R.id.btnDoubleCoffee).setOnClickListener {
            director.makeDoubleCoffee()
            Toast.makeText(this, builder.getCoffee().showCompound(), Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnCoffeeMilk).setOnClickListener {
            director.makeCoffeeMilk()
            Toast.makeText(this, builder.getCoffee().showCompound(), Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnBuild).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkCoffee).isChecked)
                builder.buildCoffee()
            if (findViewById<CheckBox>(R.id.checkDoubleCoffee).isChecked)
                builder.buildDoubleCoffee()
            if (findViewById<CheckBox>(R.id.checkMilk).isChecked)
                builder.buildMilk()
            if (findViewById<CheckBox>(R.id.checkCream).isChecked)
                builder.buildCream()
            if (findViewById<CheckBox>(R.id.checkSugar).isChecked)
                builder.buildSugar()
            if (findViewById<CheckBox>(R.id.checkCinnamon).isChecked)
                builder.buildCinnamon()
            if (findViewById<CheckBox>(R.id.checkSyrup).isChecked)
                builder.buildSyrup()
            Toast.makeText(this, builder.getCoffee().showCompound(), Toast.LENGTH_SHORT).show()
        }
    }
}