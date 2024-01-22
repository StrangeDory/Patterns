package com.example.kotlinpatterns.factorypattern.transport

import com.example.kotlinpatterns.factorypattern.cargo.Cargo
import com.example.kotlinpatterns.factorypattern.cargo.ICargo
import com.example.kotlinpatterns.factorypattern.utils.RailwayTrackArrangement
import com.example.kotlinpatterns.factorypattern.utils.TransportType

class RailwayTransport(
    override var companyName: String,
    override var maxCarryingCapacity: Double,
    override var maxCargoSize: Double,
    override var transportType: TransportType
) : ITransport() {
    var trackSize: Double = 0.0
    lateinit var trackArrangement: RailwayTrackArrangement
    override fun factoryMethod(): ICargo {
        return Cargo()
    }
}