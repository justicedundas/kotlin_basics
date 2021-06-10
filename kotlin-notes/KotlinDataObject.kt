package com.example.helloworld

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "Justice")

    user1.name = "Ryen"
    val user2 = User(1, "Ryen")

    println(user1 == user2)

    // Print all User Details -> User Details: User(id=1, name=Ryen)
    println("User Details: $user1")

    val updatedUser = user1.copy(name="Justice Dundas")
    println(user1)
    println(updatedUser)


    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // prints Justice Dundas

    val (id,name) = updatedUser
    println("id=$id, name=$name") // prints id=1, name=Justice Dundas

}