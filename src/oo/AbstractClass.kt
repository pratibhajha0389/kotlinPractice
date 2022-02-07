package oo

//so now we will understand Abstract class - in previous class human one  there were some place where we would have used abstract
//class. but in those open class human one we could have made the object of human class also but there could be scenario where we don't want to do that
//like you would want only student and employee to be created and not people of other profession so in that case you can have
//shared properties and methods in abstract class so that properties and functions ca be shared without making object of implemented class
//so with abstract class we don't need "open" any more we need to put abstract instead as abstract classes by default are open
//in short abstract class are really powerful way to encapsulate common behaviour between different classes and one
//way to achieve do not repeat your self, and it cannot be instantiated to any objects
//Abstract classes cannot inherit from any other class.
//We can NOT add abstract methods to open (non-abstract) classes, because we can create objects from the open class so it is not allowed to have abstract methods without clearly defined behavior.
//also, by default classes are final if you don't make them open and abstract, and thus you can't do anything with those classes like
//can't inherit them

abstract class Human1(open val name:String, open var age:Int){
    init {
        println("object is created")
    }

// now we want whoever is speaking it should say occupation with hello as well  so student should say hello student and employee should say
//hello employee, so we will define abstract method speak and implementing class can implement by themselves
    //thus our parent class define speak method which should be implemented by child classes
    abstract fun speak()
    fun greet(){
        println("hellp $name")
    }
    //you can use open keyword in abstract class as well
   open fun birthyear()=2022-age
}

class Student01(override val name: String, override var age: Int, val studentId:Long):Human1(name,age){

    var isIntelligetnt = true
    //implementing abstract speak method in child classes
    override fun speak() {
        println("hi  i am student01")
    }
}


class Student02(override val name: String, val studentId:Long):Human1(name,25){
    var isIntelligetnt = true
    override fun speak() {
        println("hi  i am student02")
    }

    override fun birthyear()=1990

}

class Employee01(override val name: String, override var age: Int):Human1(name,25){

    fun PaymnetReceived()= println("payment is received.")
    override fun speak() {
        println("hi  i am Employee01")
    }
}

fun main(args:Array<String>){

    val student01 = Student01("jessica",17,5676767)
    val student02= Student02("Jerry", studentId = 87878)
    val employee01=Employee01("Steve",32)
    student01.age
    println(student01.isIntelligetnt)
    println(student02.isIntelligetnt)
    student02.birthyear()
    employee01.birthyear()
    employee01.PaymnetReceived()
    student01.speak()
    student02.speak()
    employee01.speak()
}