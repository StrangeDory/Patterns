package com.example.kotlinpatterns.builderpattern.builder

class Director {
    private lateinit var builder: IBuilder

    fun setBuilder(value: IBuilder){
        this.builder = value
    }

    fun makeCoffee(){
        this.builder.buildCoffee()
    }

    fun makeDoubleCoffee(){
        this.builder.buildDoubleCoffee()
    }

    fun makeCoffeeMilk(){
        this.builder.buildCoffee()
        this.builder.buildMilk()
    }

    fun makeCoffeeCream(){
        this.builder.buildCoffee()
        this.builder.buildCream()
    }

    fun makeCoffeeSugar(){
        this.builder.buildCoffee()
        this.builder.buildSugar()
    }

    fun makeCoffeeCinnamon(){
        this.builder.buildCoffee()
        this.builder.buildCinnamon()
    }

    fun makeCoffeeSyrup(){
        this.builder.buildCoffee()
        this.builder.buildSyrup()
    }

    fun makeCoffeeMilkCream(){
        this.builder.buildCoffee()
        this.builder.buildMilk()
        this.builder.buildCream()
    }

    fun makeCoffeeMilkSugar(){
        this.builder.buildCoffee()
        this.builder.buildMilk()
        this.builder.buildSugar()
    }

    fun makeCoffeeMilkCinnamon(){
        this.builder.buildCoffee()
        this.builder.buildMilk()
        this.builder.buildCinnamon()
    }

    fun makeCoffeeMilkCreamSugar(){
        this.builder.buildCoffee()
        this.builder.buildMilk()
        this.builder.buildCream()
        this.builder.buildSugar()
    }

    fun makeCoffeeMilkCreamCinnamon(){
        this.builder.buildCoffee()
        this.builder.buildMilk()
        this.builder.buildCream()
        this.builder.buildCinnamon()
    }

    fun makeCoffeeMilkCreamSugarCinnamon(){
        this.builder.buildCoffee()
        this.builder.buildMilk()
        this.builder.buildCream()
        this.builder.buildSugar()
        this.builder.buildCinnamon()
    }
}