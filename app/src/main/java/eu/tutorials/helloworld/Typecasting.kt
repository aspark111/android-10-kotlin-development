package eu.tutorials.helloworld

fun main(args : Array<String>) {
    val stringList : List<String> = listOf("Denis", "Frank", "Michael", "Garry")
    val mixedTypeList : List<Any> = listOf("Denis", 31, 5, "BDay", 70.5, "weighs", "Kg")

    for(value in mixedTypeList) {
        if(value is Int) {
            println("Integer: $value")
        }
        else if(value is Double) {
            println("Double: $value with Floor value: ${Math.floor(value)}")
        }
        else if(value is String) {
            println("String: $value of length ${value.length}")
        } else {
            println("Unknown type")
        }

    }
    //Alternatively
    for(value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value: ${Math.floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else -> println("Unknown type")
        }
    }

    //Smart Cast
    val obj1 : Any = "I have a dream"
    if(obj1 !is String) {
        println("Not a string")
    } else {
        println("Found a string of length: ${obj1.length}")
    }

    //Explicit casting (unsafe) using the keyword "as" - can go wrong
    val str1 : String = obj1 as String
    println(str1.length)

    //Doesnt work because 1337 is not a String. Errors out
//    val obj2 : Any = 1337
//    val str2 : String = obj2 as String
//    println(str2)

    //Explicit casting (unsafe) using the keyword "as?"
    val obj3: Any = 1337
    val str3: String? = obj3 as? String //works
    println(str3) //prints null
}