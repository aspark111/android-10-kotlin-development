package eu.tutorials.helloworld

fun main() {
    //var = variable that can be changed
    //val = variable that cannot be changed
    println("Hello World");

    //When statement

    var seasons = 3
    when(seasons) {
        1 -> println("Fall")
        2 -> println("Winter")
        3 -> println("Spring")
        4 -> {
            println("Summer")
            println("Last season")
        }
        else -> {
            println("No Season Selected")
        }

    }
    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid season")
    }

    var age = 15
    when(age) {
        !in 0..20 -> println("Now you may drink in the US")
        in 18..20 -> println("You may vote now")
        16, 17 -> println("You may drive now")
        else -> println("You're too young")
    }

    var x : Any = 13.37f
    when(x) {
        is Int -> println("$x is Int")
        is Double -> println("$x is Double")
        is String -> println("$x is String")
        else -> println("$x is none of the above")
    }

    //if you switch x to 15, the "do" section will run at least once
    x = 5
    do {
        print(x)
        x++
    } while(x <= 10)
    println("do while loop finished")

    for(num in 1..10) {
        print(num)
    }
    println("")
    for(i in 1 until 10) {
        print(i)
    }
    println("")
    for(i in 10 downTo 1 step 2) {
        print(i)
    }

    //Nullables
    var name: String = "Denis"
    var nullableName : String? = "Denis"

    var len = name.length
    var len2 = nullableName?.length
    nullableName?.let{println("name is not null. Length is: " + it.length)}

    //if nullableName isn't null, then assign name to the value of nullableName. Otherwise, assign to the default value: "Guest"
    //This is callewd the Elvis operator
    val unchangeableName = nullableName ?: "Guest"
}