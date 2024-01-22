package com.example.kotlinpatterns.factorypattern.transport

import com.example.kotlinpatterns.factorypattern.cargo.Cargo
import com.example.kotlinpatterns.factorypattern.cargo.ICargo
import com.example.kotlinpatterns.factorypattern.utils.TransportType

class AutoTransport(
    override var companyName: String,
    override var maxCarryingCapacity: Double,
    override var maxCargoSize: Double,
    override var transportType: TransportType
) : ITransport() {
    override fun factoryMethod(): ICargo {
        return Cargo()
    }
}