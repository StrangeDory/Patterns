package com.example.kotlinpatterns.builderpattern.builder

import com.example.kotlinpatterns.builderpattern.Coffee

class CoffeeBuilder(): IBuilder {
    private var coffee: Coffee = Coffee()

    init {
        this.reset()
    }

    fun reset(){
        this.coffee = Coffee()
    }

    override fun buildCoffee() {
        this.coffee.add("coffee")
    }

    override fun buildDoubleCoffee() {
        this.coffee.add("double coffee")
    }

    override fun buildMilk() {
        this.coffee.add("milk")
    }

    override fun buildCream() {
        this.coffee.add("cream")
    }

    override fun buildSugar() {
        this.coffee.add("sugar")
    }

    override fun buildCinnamon() {
        this.coffee.add("cinnamon")
    }

    override fun buildSyrup() {
        this.coffee.add("syrup")
    }

    fun getCoffee(): Coffee {
        val result = this.coffee
        this.reset()
        return result
    }
}