package eu.tutorials.helloworld

import java.lang.Exception
import java.lang.IllegalArgumentException

//          primary constructor
class Person constructor(firstName: String = "John", lastName: String = "Doe") {
    var age : Int? = null
    var hobby: String = "watching Netflix"
    var firstName: String? = null

    init {
        this.firstName = firstName
        println("Person created")
    }

    //secondary constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }

    fun stateHobby() {
        println("My hobby is $hobby")
    }
}

open class Vehicle() {
    open var distance = 0;
}

class Car() : Vehicle() {
    //tells program that this variable will be initialized later in the program
    //It will error out with an Uninitialized exception if not initialized
    lateinit var owner: String



    val myBrand : String = "BMW"
        //Custom getter
        get() {
            return field.lowercase();
        }

//    Value: Conventionally, we choose the name of the setter parameter as value, but we can choose a different name if we want.
//    The value parameter contains the value that a property is assigned to.
//    Backing Field (field): It allows storing the property value in memory possible.
//    When we initialize a property with a value, the initialized value is written to the backing field of that property.
    var maxSpeed: Int = 250
        get() = field
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Max speed must be greater than 0")
        }

    var myModel : String = "M5"
        //can only be changed inside the class itself.
        //When you try to modify a private class variable in another function such as the main function,
        //the program will error out
        private set

    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}
//data classes' primary function is to hold data. It doesn't have any functions inside of it - no initialized variables;
//just data
data class User(val id: Long, val name: String)

interface Drivable {
    val maxSpeed: Double;
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

class Motorcycle(val make : String = "", val model: String = "", override val maxSpeed: Double) : Drivable {
    override fun drive(): String {
        return "Implementing the interface drive"
    }

}

fun main() {
    var user = User(1, "Alex")
    var updated = user.copy(name="Denis")
    println("Component 1 of data class User: ${user.component1()}") //prints 1
    println("Component 2 of data class User: ${user.component2()}") //prints Alex
    val (userId, userName) = updated
    print("Id ${userId}, Name ${userName}")

    //class object
    var denis = Person("Denis", "Panjuta", 31)
    denis.hobby = "to skateboard"
    denis.age = 32
    denis.stateHobby()
    var default = Person()
    println(default.firstName)
    var differentLastName = Person(lastName = "Smith")

    var myCar = Car()
    println("brand is: ${myCar.myBrand}")

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