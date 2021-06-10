package com.example.helloworld

fun main(){
    // immutable variable
    // TODO: Add new functionality
    // type string
    val myName = "Justice"
    // type int
    // type inference finds out type for you
    var myAge = 26

    // Integer TYPES: Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 27
    val myShort: Short = 128
    val myInt: Int = 12356345
    val myLong: Long = 123_123_456_798

    // Floating Point number Types:
    // Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.123556778881235456

    // Booleans are used to represent logical values
    // It can have two possible values true and false
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '8'

    // Strings
    val myStr = "Hello World"
    var firstCharInString = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
//    print("First Char is $firstCharInString")
//    print("Last Char is $lastCharInStr")

    // Arithmetic operaters (+, -, *, /, %)
    var result = 5 + 3
    val a = 5.0
    val b = 3
    // Can allocate space to variable with type declaration
    // can assign values in future
    var resultDouble : Double
    resultDouble = a / b
//    print(resultDouble)

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
//    println("isEqual is $isEqual")

    val isNotEqual = 5 != 5
//    println("isNotEqual is $isNotEqual")
//    println("is5greater3 ${-5>3}")
//    println("is5GreaterEquals5 ${5>=5}")

    // Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3      // equals 5 + 3 = 8
    myNum *= 4      // equals 8 x 4 = 32


    // Increment & Decrement operators (++, --)
    myNum++         // equals 32 + 1 = 33
//    println("myNum is $myNum")
    /*
        myNum++ returns 33 because 1 is added to
        variable *AFTER* the string is printed
        change to ++myNum to get 34
     */
//    println("myNum is ${myNum++}")      // returns 33
//    println("myNum is ${++myNum}")      // returns 35
//    println("myNum is ${--myNum}")      // returns 34

    /*
        IF statements:
            * Conditional Operator, can use;
            * if, elseif, else
     */
    var heightPerson1 = 170
    var heightPerson2 = 170
//
//    if(heightPerson1 > heightPerson2) {
//        println("person1 is taller")
//    }else if(heightPerson1 == heightPerson2){
//        println("they are the same height")
//    }else{
//        println("person2 is taller")
//    }

    // Check age requirements
    var age = 5

    if(age >= 21){
        println("You can drink in the US!")
    }else if(age >= 18){
        println("You can legally vote!")
    }else if(age >= 16){
        println("You can legally drive!")
    }else{
        println("Sucks to suck, you're to young to have fun.")
    }

    var name = "Justice"

    if(name == "Justice"){
        println("Welcome home Justice")
    }else{
        println("Who are you?")
    }

    // Simplified conditional statement
    val isRainy = true
    if(isRainy)
        println("It's rainy, pack an umbrella")

    // Print season
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    // Print season based on month
    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
//        in 12 downTo 2 -> println("Winter")
        12, 1, 2 -> println("Winter")   // same as above
        else -> println("Invalid Season")
    }

    // Check age with When statement instead of If
    age = 22
    when(age){
        in 21..150 -> println("now you can drink in the US")
        in 18..20 -> println("you can vote now")
        16,17 -> println("you may drive now")
        else -> println("you're too young")
    }

    var x: Any = 13.37F
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        // !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    /*
        WHILE LOOP:
            execute code while condition is true
            * keep executing block of code
     */
    var y =1
    println("Starting while loop")
    while(y <= 10) {
        print("$y ")
        y++
    }
    println("\n while loop is done")

    // Count down from 100
    var c = 100
    while(c >= 0) {
        print("$c")
        c--
    }
    println("\nCountdown is done")

    /*
        DO WHILE LOOP:
            Example: use when retrieving data froms server
            do{ print user}while (connection == true)
     */
    x = 15
    do{
        print("$x")
        x++
    }while (x <= 10)
    println("\ndo while loop is done")

    // Exmple: increase thermostat until room is comfy
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    // For loop *ITERATOR*
    for(num in 1..10){
        print("$num")
    }
    for(i in 1 until 10){
        print("$i ")
    }
    println("\n__________")
    // Count down from 10 to 1 in steps of 2
    for(i in 10 downTo 1 step 2){
        print("$i ")
    }

}