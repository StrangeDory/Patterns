package com.example.kotlinpatterns.factorypattern.transport

import com.example.kotlinpatterns.factorypattern.cargo.ICargo
import com.example.kotlinpatterns.factorypattern.utils.TransportType

abstract class ITransport {
    abstract var transportType: TransportType
    abstract var companyName: String
    abstract var maxCarryingCapacity: Double
    abstract var maxCargoSize: Double

    abstract fun factoryMethod(): ICargo

    fun operation(): String = "Cargo is delivered by ${this.transportType}"
}