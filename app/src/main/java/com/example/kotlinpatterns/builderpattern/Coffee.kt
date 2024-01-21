package com.example.kotlinpatterns.builderpattern

class Coffee {
    private var compound = emptyList<String>()

    fun add(part: String) { this.compound += part }

    fun showCompound(): String = "Description: ${this.compound.joinToString("+ ")}"
}