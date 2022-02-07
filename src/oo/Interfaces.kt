package oo

//interfaces are like contract that each class has to bind with whichever implements it
//lets create interface drivable which any class implements it has ti implements its method drive
//in interface you don't have to define any method as abstract keyword as by default all the methods and properties are abstract by defacult

interface Drivable{
    fun drive()
    //although you can have default implementations here
    fun defaultmethod(){
        println("default method")
    }
}

//we can add peroperties as well but the properties cant have state and we cant initialize the value in interface
interface Buildable{
    fun build()
    //adding  aproperty if initialized it will give error
   // var timerequired:Int=10
    var timerequired:Int
}

//lets implement teh class which implement the interface

class Car(var color:String):Drivable,Buildable{
    override fun drive() {
        println("driving the car...")
    }

    override var timerequired=10
    override fun build() {
        println("built is shiny car")
    }
}
class Motorcycle(var color:String):Drivable{
    override fun drive() {
        println("driving the Motorcycle...")

    }

    override fun defaultmethod() {
        println("you can override default method also ")
    }
}

fun  main(args:Array<String>){

    //so now if you define the type of car as Drivable as you can only use Drivable methods and properties implemented inside a
    // a car class and you wont be able to access methods like build or time required

    val car:Drivable=Car("red")
    car.drive()
    //below will give error
    //car.build()
    var motorcycle:Drivable=Motorcycle("red")
    motorcycle.drive()
    car.defaultmethod()
    motorcycle.defaultmethod()
    val car2=Car("yellow")
    car2.build()
    car2.drive()
}