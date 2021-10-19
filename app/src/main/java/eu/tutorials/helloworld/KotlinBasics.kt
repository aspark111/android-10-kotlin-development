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
}