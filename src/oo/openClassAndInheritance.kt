package oo

//so let's understand the inheritance here - we need that only when we have some common function that can be used in other classes and
//we can avoid code duplication here. to inherit the class we need to declare open KEYWORD infront of the class to which we want
//to inherit and use override method to the variables of constructor of that class which we want to use from inherited class
//or simply give default value if you don't want to override the variable

//this below class can be inherited by employee and student
open class Human(open val name:String, open var age:Int){
    init {
        println("object is created")
    }
    fun speak(){
        println("hello")
    }
    fun greet(){
        println("hellp $name")
    }
    fun birthyear()=2022-age

    //if method or function declared open then you are allowed to override that in you child classes

    open fun intro(){
        println("hi this is intro")
    }
}
//this will inherit above class, to inherit we will use colon for Human class and make Human class and its variable open
//so that they can be overridden like name and age
class Student(override val name: String, override var age: Int, val studentId:Long):Human(name,age){

    var isIntelligetnt = true

        override fun intro() {
        super.intro()
        println("overriding intro from human class")
    }
}


//this will inherit above class but lets take that here all student age will be same so we will pass default value
class Student1(override val name: String, val studentId:Long):Human(name,25){
    var isIntelligetnt = true

}

class Employee(override val name: String, override var age: Int):Human(name,25){

    fun PaymnetReceived()= println("payment is received.")
}

fun main(args:Array<String>){

    val student = Student("jessica",17,5676767)
    val student1 =Student1("Jerry", studentId = 87878)
    val employee=Employee("Steve",32)
    student.age
    println(student.isIntelligetnt)
    println(student1.isIntelligetnt)
    student1.birthyear()
    employee.birthyear()
    employee.PaymnetReceived()
}