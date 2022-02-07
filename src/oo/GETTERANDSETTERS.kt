package oo

//ITS LITTLE DIFFERENT IN KOTLIN . In Java iif you declare var a:Int=5 that will be considered as field
//but in  kotlin it will be considered as property such that whenever you call, it  will by default call getter and setter of it which get implement bydefault in backend
//if yoy use val the to write its setter kotlin will not allow as you can set it only once
//values which are mutable have getters and setters both
//as in java it is direct field acces sso if you want to have loic in intialization later then you might have to change everywhere
//but in kotlin this wont happen and you can override the setter .
open class Animal{
    var age:Int=0
        //so either write it like a method or inline function
        //so field here is internal or implicit defined variable that you can use only in getter and setter
        //to refer to this backing field that the property has and this case ofcourse to access the actual value of the age property
        //now you couldnt go ahead and say get=this.age  >> because it will keep calling the get property which is like a loop
        //i.e. keep on calling it over and over again without terminating it
        //so what you have to do is read out the actual property with help of this backing field, which is always going
        //to be called  "field" by default
    get() = field
    set(value) {
        if (value>=0){
            field=value
        }
    }
    val animalname:String=""
    get() =field
   // error in set as it is val
    //set(value) {}

    //also lets learn about protected and private , protected only make sense of open classes else all is private then
    //so protected can be accessible in subclass whether the  parent class is in same or different package but private can be accessed within the class

    private var age1:Int=0
    protected var name2:String="Jhon"
    //internal variable can be used inside the same module or project so //kotlinstudy is a project here and each packages inside a module will be accessible
    //but if you have subclass in different project or module then you will have access to the protected properties but not internal or private
    //public can be accessible everywhere and it is the default visibility
    internal var isDangerous:Boolean=true
}

class Vertibrate:Animal(){
    fun intro(){
        println("my name is ${this.name2}")
        var isdangerous2:Boolean=this.isDangerous
    }
}
fun main(args:Array<String>){
   val animal =Animal()
    animal.age=8
    //it will not error out though but it will not set the val to -2 as it does not fit in logic so val will remain 8 only although its not a great design but will learn more about it later
    animal.age =-2
    println(animal.age)
}