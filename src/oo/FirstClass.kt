package oo
//properties are just variables you define inside your class

//normal way of creating class without constructor parameter
//class Person{
    //creating a constructor which is done like below
//class Person(name:String,age:Int){
    //now these written below is the boiler plate code but kotlin bydefaults handle it pretty well
// and thus you wont need to define inside init as well which i  will comment out  further
 //   var name:String
 //   var age:Int

class Person(val name:String,var age:Int){

    var name1:String="Sarah"
    var age1:Int=21
    //you can use the parameter inside class but inside fun it will give error
    var birthyear = 2022-age
    //to initialize it at the time of object is created and this.name will be referred
    /*init {
        println("this is when object is created")
        this.name=name
        this.age=age
    }*/

    init {
        println("this is wiothout initializing the age and name")
    }
    fun speak(){
        println("hi")
    }
    fun greet(name:String){
        println("hi $name")
    }
    fun getbirthyear():Int{
        return 2022 - age
    }
    //the above method can be written in concise way in kotlin for simple methods like above

    fun getBirthyear2() = 2022-age



}

fun main(args:Array<String>){
    //Creating an object of a class Person - this will create a person name sara of age 21
    val person = Person("pratibha",32 )
    println(person.age)
    println(person.name)
    //let's change the property name and age, but it can be changed because it is immutable as it var not val

   // person.name = "Peter"
    //person.age =42
    //println(person.name)
    //println(person.age)
    person.speak()
    person.greet("world")
    println("the birth year is " + person.getbirthyear())
    println("the birth year is " + person.getBirthyear2())

}
