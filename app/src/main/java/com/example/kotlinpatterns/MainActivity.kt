package com.example.kotlinpatterns

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinpatterns.factorypattern.transport.RailwayTransport
import com.example.kotlinpatterns.factorypattern.transport.WaterTransport
import com.example.kotlinpatterns.factorypattern.utils.TransportType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnWaterTransport).setOnClickListener {
            val waterTransport = WaterTransport("Lola", 235.0, 100.0, TransportType.WATER_TRANSPORT)
            Toast.makeText(this, waterTransport.operation(), Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.btnRailwayTransport).setOnClickListener {
            val railwayTransport = RailwayTransport("Lola", 235.0, 100.0, TransportType.RAILWAY_TRANSPORT)
            Toast.makeText(this, railwayTransport.operation(), Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.btnAirTransport).setOnClickListener {
            val airTransport = WaterTransport("Lola", 235.0, 100.0, TransportType.AIR_TRANSPORT)
            Toast.makeText(this, airTransport.operation(), Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.btnAutoTransport).setOnClickListener {
            val autoTransport = WaterTransport("Lola", 235.0, 100.0, TransportType.AUTO_TRANSPORT)
            Toast.makeText(this, autoTransport.operation(), Toast.LENGTH_SHORT).show()
        }
    }
}