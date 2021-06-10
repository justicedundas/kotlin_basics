package com.example.helloworld

/*
    Classes & Objects
 */

fun main() {
    var justice = Person("Justice", "Dundas", 26)
    justice.hobby = "to skateboard"
    justice.age = 27
    println("Justice is ${justice.age} years old")
    justice.stateHobby()
//    var john = Person()
//    john.hobby = "play video games"
//    john.stateHobby()
//    var johnPeterson = Person(lastName = "Peterson")
}

class Person(firstName: String = "John", lastName: String = "Doe"){
    // Member Variables - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName: String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
        this.age = age
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName and age = $age")
    }

    // Member functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}