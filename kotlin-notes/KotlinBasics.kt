package com.example.helloworld

import java.lang.ArithmeticException
import java.lang.NullPointerException
import java.lang.NumberFormatException


fun main(){
    // ArrayLists
     emptyArrayList()         // create empty array, fill with "One" and "Two", print array items
     collectionsArrayList()   // create ArrayList, create mutable list, add collections, print items
     getArrayList()           // create empty ArrayList, fill with "One", "Two", return item at index 1

    // Lambda Expressions
     lambdaSum()              // add two integers, print result

    // Nested Class
    println(OuterClass.NestedClass().description)   // accessing property
    var obj = OuterClass.NestedClass()              // object creation
    obj.foo()                                       // access member function

    // Inner Class
    println(OuterClass().InnerClass().description)  // accessing property
    var innerObj = OuterClass().InnerClass()        // Object creation
    innerObj.foo()                                  // access member function

    // Unsafe Casts (TypeCast & ClassCast Exceptions)
    unsafeCast()

    // Safe Casts
    safeCast()

    // Try-Catch Exception Handling
    tryCatchNoHandling()  // output 10 without exception handling
    tryCatchExceptionHandling() //  output 0 with Number exception handled

    // Multiple Catch Block Exception Handling
    multipleCatchBlocks()   // output arithmetic exception catch

    // Finally Block Example
    finallyBlock()

    // Throw Keyword Example
    throwException()        // output custom exception "under age"

}

/*
****************************************************************************
******************************** Array Lists *******************************
****************************************************************************
*/
/*
    ArrayLists:
        * Used for: Create dynamic arrays (+/- to your needs)
        * Functionalities:
            * Read & Write
        * Follows "sequence of insertion" order
        * Non synchronized (may contain duplicates)
        Constructor:
            * ArrayList<E>():                   -> Creates empty ArrayList
            * ArrayList(capacity: Int):         -> Create ArrayList of specified capacity
            * ArrayList(elements: Collection<E>:-> Create ArrayList filled with elements of collection

        Functions:
            * open fun add(element: E): Boolean     -> Add specific element to collection
            * open fun clear()                      -> remove all elements from collection
            * open fun get(index: Int): E           -> return element at specified index in list
            * open fun remove(element: E): Boolean  -> used to remove single instance of specific elements
            * And more......
 */


/*
    Empty ArrayList:
        * Output:
            .....print Empty ArrayList.....
            One
            Two
 */
fun emptyArrayList(){
    val arrayList = ArrayList<String>()     // Create empty arraylist
    arrayList.add("One")                    // Add an object to arraylist
    arrayList.add("Two")
    println(".....print Empty ArrayList.....")
    for (i in arrayList) {
        println(i)
    }
}

/*
    ArrayList using collections
        * Output:
            .....print Collections ArrayList.....
            One
            Two
            size of arrayList = 2
 */
fun collectionsArrayList(){
    val arrayList: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()     // create mutable list

    list.add("One")     // add "One" to list
    list.add("Two")     // add "Two" to list

    arrayList.addAll(list)

    println(".....print Collections ArrayList.....")
    // Iterator
    val itr = arrayList.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }
    println("size of arrayList = "+arrayList.size)
}

/*
    ArrayList Get Function
        * args: Array<String>
        * OutputL
            .....print Get ArrayList.....
            Two
 */
fun getArrayList(){
    val arrayList: ArrayList<String> = ArrayList<String>()

    arrayList.add("One")    // add "One" to ArrayList
    arrayList.add("Two")    // add "Two" to ArrayList

    for (i in arrayList){   // iterate over all items in ArrayList
        println(i)      // print item
    }
    println(".....arrayList.get(1).....")
    println(arrayList.get(1))   // print element at index 1
}
/*
****************************************************************************
**************************** Lambda Expressions ****************************
****************************************************************************
*/
/*
    Lambda Expressions:
        * Function that has no name
        * Both Lambda expressions & anonymous functions are 'function literals'
            * ex: functions not declared, but passsed immediately as expression
        * Defined with -> {}    // Curly braces
        * Syntax:
            { variable(s) -> body_of_lambda }
 */
/*
    Arithmetic Lambda:
        Params: Int, Int
        Output:
            .....lambdaSum.....
            15
 */
fun lambdaSum(){
    // Sum Lambda Expression
    // val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    // println(sum(10,5))

    // Shorter Sum Lambda
    println(".....lambdaSum.....")
    val sum = { a: Int, b: Int -> println(a + b)}
    sum(10, 5)
}
/*
****************************************************************************
************************** Visibility Modifiers ****************************
****************************************************************************
*/
/*
    Visibility Modifiers:
        * keywords used to restrict use of classes, interfaces, methods, and properties
        * Used in -> Class Header, Method Body, etc.
        * Four different types:
            1. public
            2. private
            3. protected
            4. internal
 */

/*
    Public Modifier
        * default modifier in Kotlin
 */
class OuterClass {
    /*
        Private Modifier:
            * block properties, fields, etc. only accessible in local scope
     */
    private var name: String = "Mr X"

    /*
        Nested Class
            * Class created inside another class
            * Static by default
            Output:
                .....NestedClass Code.....
                Id is 101
     */
    class NestedClass {
        var description: String = ".....NestedClass Code....."
        private var id: Int = 101
        fun foo() {
            // print("name is ${name} // cannot access the outer class member
            println("Id is ${id}")
        }
    }
    /*
        Inner Class
            * use "inner" modifier
            * can access private outer class member
            Output:
                .....InnerClass Code.....
                name is Mr X
                Id is 101
    */
    inner class InnerClass {
        var description: String = ".....InnerClass Code....."
        private var id: Int = 101
        fun foo() {
            println("name is ${name}")  // access private outer class member
            println("Id is ${id}")
        }
    }
}

/*
****************************************************************************
*********************** TypeCasting: Cast Operators ************************
****************************************************************************
*/

/*
Unsafe Cast Operator:
    * "as" keyword
    * Nullable casting to get it working
    Output:
        String unsafe cast
    Exceptions:
        * TypeCastException -> null can't be cast to non-null type (ex: String)
        * ClassCastException -> cast integer value of Any type into string type
*/
fun unsafeCast(){
// TypeCastException
// val obj: Any? = null
// val str: String = obj as String
// println(str)

// ClassCastException
// val obj2: Any = 123
// val str2: String = obj2 as String
// println(str2)

// Nullable Casting
val obj3: Any? = "String unsafe cast"
val str3: String? = obj3 as String?     // Works
println(str3)
}
/*
Safe Cast Operator:
    * "as?" -> safe cast operation for typecasting
    * returns null instead of throwing ClassCastException
    Output:
        Kotlin
        null
*/
fun safeCast(){
val location: Any = "Kotlin"
val safeString: String? = location as? String
val safeInt: Int? = location as? Int
println(safeString)
println(safeInt)
}
/*
****************************************************************************
**************************** Exception Handling ****************************
****************************************************************************
*/
/*
Exception Handling
    * Exception -> runtime problem that occurs in program and leads to termination
    * Examples:
        - running out of memory
        - array out of bound
        - condition like divided by zero
    * Exception Handling is a technique which handles runtime problems and maintains execution flow

Unchecked Exceptions:
    * exception thrown due to mistakes in our code
    * Exception Type extends the RuntimeException class
    * Examples:
        - ArithmeticException -> thrown dividing number by 0
        - NumberFormatException -> wrong formatting for type
        - ArrayIndexOutOfBoundExceptions -> thrown when array tried to access incorrect value
        - SecurityException -> thrown by security manager to indicate security violation
        - NullPointerException -> thrown when invoking method or property on a null object

Checked Exception:
    * exception is checked at compile time
    * Extends the Throwable Class
    * Examples:
        - IOException
        - SQLException

*/

/*
Exception Handling: Try-Catch
    * used for exception handling
    * Syntax of try with catch block:
        try {
            // Code that may throw exception
        } catch(e: SomeException) {
            // Code that handles exception
        }
*/
fun getNumber(str: String): Int {
return try {
    Integer.parseInt(str)
} catch(e: NumberFormatException){
    0
}
}

fun tryCatchNoHandling(){
val str = getNumber("10")
println(str)    // output 10
}

fun tryCatchExceptionHandling(){
val str = getNumber("10.5")
println(str)    // output 0 with Exception Catch
}

/*
Exception Handling: Multiple Catch Blocks
    * Used when different types of operations in try block may cause different exceptions
    * Output:
        ArithmeticException catch
        ... Code after Try-Catch ...
*/
fun multipleCatchBlocks(){      // args: Array<String>
try {
    val a = IntArray(5)
    a[5] = 10/0
} catch(e: ArithmeticException) {
    println("ArithmeticException catch")
} catch(e: ArrayIndexOutOfBoundsException) {
    println("Array Index OutOfBounds exception")
} catch(e: Exception) {
    println("parent exception class")
}
println("... Code after Try-Catch ...")
}

/*
Exception Handling: Nested Try-Catch Block
    * Used when an exception is caught in both original try-catch block and caught exception block
    * Syntax:
        try {   // code block
            try {   // code block
            } catch(e:SomeException) {
                // exception
            }
        } catch(e: SomeException) {
            // exception
        }
*/
fun nestedTryCatch() {
    null
}

/*
Exception Handling: Finally Block
        * Important code that always runs after try-catch
        * Output:
            2
            finally block always executes
            ... below finallyBlock code ...
*/
fun finallyBlock(){
try {
    val data = 10 / 5
    println(data)
} catch(e: NullPointerException) {
    println(e)
} finally {
    println("finally block always executes")
}
println("... below finallyBlock code....")
}

/*
Exception Handling: Throwable Class:
    * Syntax -> throw MyException("this throws an exception")
    * 4 Keywords for exception handling:
        1. try
            * block that might cause exception -> followed by either catch/finally or both
        2. catch
            * catches exception thrown from try block
        3. finally
            * always execute where exception is handled or not
            * Used for IMPORTANT CODE (like closing buffers)
                - ex buffers: access buffers -> internet, phone storage etc.
        4. throw
            * throw an exception explicitly
*/

/*
Exception Handling: Throw Keyword
    * Throw a custom exception
    * Syntax -> throw SomeException()
    * Output:
        Exception in thread ... : under age
 */
fun throwException() {
    validate(15)    // call another function, throw Under-Age error
    println("code after validation check...")
}

fun validate(age: Int) {
    if (age < 19)
        throw ArithmeticException("under age")
    else
        println("Eligible to drink!")
}




