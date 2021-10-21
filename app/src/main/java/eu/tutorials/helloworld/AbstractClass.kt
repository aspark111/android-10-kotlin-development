package eu.tutorials.helloworld

//An abstract class cannot be instantiated
//You can however create objects of an abstract class
//However, you can inherit subclasses from an abstract class
//The members (properties and methods)< of an abstract class are non-abstract
//unless you explicitly use the abstract keyword to make them abstract

abstract class Mammal(private val name: String, private val origin : String, private val weight: Double ) { //Concrete (Non Abstract) Properties
    //Abstract Property (Must be overridden by subclasses)
    abstract var maxSpeed : Double

    //Abstract Methods must be implemented by its subclasses
    abstract fun run()
    abstract fun  breath()

    //Concrete non abstract methods
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, MaxSpeed: $maxSpeed")
    }

}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double) : Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breathes through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double) : Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breathes through the trunk")
    }
}

//Abstract class vs interface:
//Interfaces cannot hold state; can implement multiple interfaces, but only inherit from one class
//Classes, even abstract, have constructors.
//Interfaces cannot hold fields.

fun main() {
    val human = Human("Denis", "Russia", 70.0, 28.0)
    val elephant = Elephant("Rosy", "India", 5400.0, 25.0)

    //cannot run below line of code because object instances of abstract classes
    //cannot be created
    //val mammal = Mammal("Denis", "Russia", 70.0, 28.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

}