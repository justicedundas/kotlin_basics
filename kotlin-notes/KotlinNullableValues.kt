package com.example.helloworld

fun main(){
    // var name :String = "Justice"
    // name = null -> Compilation ERROR
    var nullableName : String? = "Justice"
//    nullableName = null
    // ?. is a safe-call operator
    var len2 = nullableName?.length     // len2 below is same as commented if statement below
    nullableName?.let { println(it.length) }

    // ?: Elvis operator
    val name = nullableName ?: "Guest"
    println("name is $name")

    // !! force non-nullable
    println(nullableName!!.toLowerCase())

    // Example chaining safe calls together
    // val wifesAge: String? = user?.wife?.age ?: 0

    /*if(nullableName != null){
        var len2 = nullableName.length
    }else {
        null
    }*/
}