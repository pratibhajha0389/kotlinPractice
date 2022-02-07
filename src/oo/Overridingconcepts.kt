package oo

//so lets learn some rules for overriding

abstract class Courses(val name:String, var price:Double){
    open fun learn(){
        println("we are learning different courses here like $name")
    }
}

interface Learnable{
    fun learn(){
        println("we are learning different Lernable courses here")
    }
}
//now you can override method of your abstract class courses but let's say if create a further subclass of kotlin class
//then can you override the method learn , yes you can till further you decide where you want to stop making the method
//final and not overridden, so you have to then specify final with it , as of now final was hidden and by default you never needed to mention it final
//it is final until abstract or open is not written but in case of overriding you need to mention when you want to stop making it open for overriding to its
// further subclasses down the tree
//thus overridden functions are open by default, and we can stop them by making it final
open class  KolinCourse():Courses("Kotlin", 999.99),Learnable{

    //by default it will consider interface learn function as same name is ther and hece causing ambiguity but does not matter
   // as we are chnaging the implementation but what if i want to use courses learn method
    override fun learn() {
        println("we are learning Kotlin course")
    }
    //for that
   /* override fun learn() {
        super.learn<Courses>() // super is used when you want the default implementation of super class or interface also
        println("we are learning Kotlin course")
    }*/
   /* override fun learn() {
        super.learn<Learnable>()
        println("we are learning Kotlin course")
    }*/
}
open class  SpeciaKolinCourse():KolinCourse(){
    override fun learn() {
        println("we are learning special Kotlin course")
    }
}
open class  verySpecialKotlinCourse():SpeciaKolinCourse(){
    final override fun learn() {
        println("we are learning verySpecialKotlinCourse course")
    }
}
class  amazingKotlinCourse():verySpecialKotlinCourse(){
    //it will give error here
    /*override fun learn() {
        println("we are learning amazingKotlinCourse course")
    }*/
}