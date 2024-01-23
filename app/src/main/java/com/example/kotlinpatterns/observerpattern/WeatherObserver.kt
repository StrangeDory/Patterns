package com.example.kotlinpatterns.observerpattern

import java.util.Timer
import java.util.TimerTask

class WeatherObserver private constructor() {
    private val observers = mutableListOf<WeatherObserverCallback>()
    private var timer: Timer? = null

    interface WeatherObserverCallback {
        fun onWeatherUpdate(weather: Int)
    }

    fun subscribe(observer: WeatherObserverCallback) {
        observers.add(observer)
    }

    fun unsubscribe(observer: WeatherObserverCallback) {
        observers.remove(observer)
    }

    private fun notifyObservers(weather: Int) {
        observers.forEach { it.onWeatherUpdate(weather) }
    }

    private fun updateWeather() {
        val weather = (System.currentTimeMillis() / 1000 % 35).toInt()
        notifyObservers(weather)
    }

    fun startUpdating() {
        timer = Timer()
        timer?.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                updateWeather()
            }
        }, 0, 5000)
    }

    fun stopUpdating() {
        timer?.cancel()
        timer = null
    }

    companion object {
        private var instance: WeatherObserver? = null

        fun getInstance(): WeatherObserver {
            if (instance == null) {
                instance = WeatherObserver()
            }
            return instance!!
        }
    }
}