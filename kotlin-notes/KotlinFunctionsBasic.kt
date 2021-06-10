package com.example.helloworld

fun main(){
    // argument
    var result = addUp(5,3)
    print("result of 5 + 3 is $result")

    var avg = average(10.0,8.0)
    print("\naverage of 10 and 8 is $avg")
}

/*
    Parameters:
        * @a: Type Int
        * @b: Type Int
    Output:
        * Type Int
 */
fun addUp(a: Int, b: Int) : Int{
    // Output of function
    return a + b
}
/*
    Parameters:
        * @a: Type Double
        * @b: Type Double
    Output: Type Double
 */
fun average(a: Double, b: Double): Double{
    return (a + b) / 2
}

fun myFunction(){
    print("Called from myFunction")
}