package com.example.fundamentalskotlin.Tutorials

fun main() {
    val device = SmartDevice()

    
    device.name = "Test"
    device.turnOn()
    device.turnOff()
}

class SmartDevice {
    public var name = "Default"

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

