package com.example.kotlinpatterns

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.kotlinpatterns.observerpattern.WeatherObserver
import com.example.kotlinpatterns.ui.PagerAdapter

class MainActivity : AppCompatActivity(), WeatherObserver.WeatherObserverCallback {
    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        pagerAdapter = PagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter

        val weatherObserver = WeatherObserver.getInstance()
        weatherObserver.subscribe(this)
        weatherObserver.startUpdating()
    }

    override fun onDestroy() {
        super.onDestroy()

        val weatherObserver = WeatherObserver.getInstance()
        weatherObserver.unsubscribe(this)
    }

    override fun onWeatherUpdate(weather: Int) {
        this.runOnUiThread {
            findViewById<TextView>(R.id.textWeather).text = "Weather: ${weather}"
        }
    }
}