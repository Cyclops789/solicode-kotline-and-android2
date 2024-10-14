// Classes
fun main() {
    // runSmartDevice()
    // runCar()
    runCall()
}

fun runSmartDevice() {
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

// Classes - get / set
fun runCar() {
    var carInstance = Car()

    carInstance.speed = 2
    carInstance.level = 1

    carInstance.runCar()
}

class Car {
    var speed = 1
       get() = field
       set(value) {
          field = 2 * value
       }

    var level = 1
	get() = field
	set(value) {
	  field = value
        }

    fun runCar() {
	println("Speed is $speed and level is $level")
    }
}
// Constructor

fun runCall() {
    val phone = Phone("Hamza", "+21222020202")

    phone.call()
}

class Phone(val name: String, val number: String) {
    fun call() {
	println("Calling $name - $number ....")
    }
}

