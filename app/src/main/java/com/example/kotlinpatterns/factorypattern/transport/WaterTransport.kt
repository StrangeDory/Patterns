package com.example.kotlinpatterns.factorypattern.transport

import com.example.kotlinpatterns.factorypattern.cargo.Cargo
import com.example.kotlinpatterns.factorypattern.cargo.ICargo
import com.example.kotlinpatterns.factorypattern.utils.TransportType
import com.example.kotlinpatterns.factorypattern.utils.WaterTransportType

class WaterTransport(
    override var companyName: String,
    override var maxCarryingCapacity: Double,
    override var maxCargoSize: Double,
    override var transportType: TransportType
) : ITransport() {
    lateinit var waterType: WaterTransportType
    override fun factoryMethod(): ICargo {
        return Cargo()
    }
}