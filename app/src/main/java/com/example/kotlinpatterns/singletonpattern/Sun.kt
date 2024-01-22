package com.example.kotlinpatterns.singletonpattern

class Sun private constructor() {
    companion object {
        private var instance: Sun? = null
        fun getInstance(): Sun {
            if (instance == null)
                this.instance = Sun()
            return this.instance!!
        }
    }
}