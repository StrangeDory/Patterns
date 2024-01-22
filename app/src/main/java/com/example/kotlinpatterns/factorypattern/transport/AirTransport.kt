package com.example.kotlinpatterns.factorypattern.transport

import com.example.kotlinpatterns.factorypattern.cargo.Cargo
import com.example.kotlinpatterns.factorypattern.cargo.ICargo
import com.example.kotlinpatterns.factorypattern.utils.AirTransportDistanceType
import com.example.kotlinpatterns.factorypattern.utils.AirTransportType
import com.example.kotlinpatterns.factorypattern.utils.TransportType

class AirTransport(
    override var companyName: String,
    override var maxCarryingCapacity: Double,
    override var maxCargoSize: Double,
    override var transportType: TransportType
) : ITransport() {
    lateinit var airTransportType: AirTransportDistanceType
    lateinit var airTransport: AirTransportType
    override fun factoryMethod(): ICargo {
        return Cargo()
    }
}