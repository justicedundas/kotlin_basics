package com.example.helloworld


/*
    Inheritance
    * Class that inherits features of another class -> Sub Class or Child Class or Derived Class
    * Class whose features are inherited -> Super Class or Parent Class or Base Class
 */

/*
    Interface
    * Use if you are certain of functions to be used later and parameters are known
 */
interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}


// Sub Class, Child Class, or Derived Class of Vehicle
open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    // override fun drive() = "driving the interface drive"
    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

// Sub Class, Child Class, or Derived Class of Car
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
    : Car(maxSpeed,name, brand){

    var chargerType = "Type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}

fun main(){
    var audiA3 = Car(200.0,"A3", "Audi")
    var teslaS = ElectricCar(300.0,"S-Model", "Tesla", 85.0)
    teslaS.chargerType = "Type2"
//    teslaS.extendRange(200.0)

//    teslaS.drive()
    teslaS.brake()
    audiA3.brake()

    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)

}
