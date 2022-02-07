package oo

// DRY - DONT REPEAT YOURSELF THAT IS Y GENRICS IS NEEDED, LIKE LOOPS WE IMPLEMENT THIS PRINCIPLE
//ex Abstract classes- so that you dont repeat your code in subclasses
//lets see why generics is need - we can have a class stack which have two method push and pop -
// now imagine that you want stack of int , double
//then you will have int and double stack subclass and call its object but let's say if there is some change then
// you have to replicate the subclasses int and double clases as well
//you can use E,T,K, V type pf parameter
//<E> that means it can be stack of Int , doubles etc
//so lets implement by having a constructor parameter her now , which is going to be a so called "vararg"
//which allows you to add as many elements of the specified types as you want
//it is ver convenient way of putting the multiple element of same type not bound with amount, but you also don't have to create an
//extra array or list just to pass the extra element (more than one )
//so it can be val myStack = Stack(1,2,3,4)
class Stack<E>(vararg val items:E){
    //this will return an vararg items as a list //here we are restricting the user for elements as list as
    // through list only pop and push operation can happen
    val elements = items.toMutableList()
    //now here the logic will not be dependent on what kind of element you have and implement the methods in very generic or abstract way
    // so if write arrayof(1,2,3) - kotlin will infer that it is of int type stack
    //push the element from top and pop from top
    fun push(element: E){
        elements.add(element)
    }
    //making it nullable type
    fun pop():E?{
        if (!isEmpty()){
            return elements.removeAt((elements.size-1))

        }else{
            return null
        }

    }

    //function to avoid teh out of bound exception and update push and pop method
    fun isEmpty():Boolean{
    return elements.isEmpty()
    }

}

//GENERIC FUNCTIONS - specify the type parameter lets call it as <T> you can use E as wel
//use * operator
//so now at run time any vararg operator is actually represented as an array of some type as run time it is packaged into an array if you put
// val stack = Stack(1,2,3) - it is packaged as array at run time
//so in below function if don't put * it actually comes out as array of any number or string whatever you provide later on
//is coming as an array , these elements type here is as of now if type array of T
//thus intelij will say that to infer type of this element is actually a stack of array because element is now of type array
//so this will be a stack of one element where that one element is just is of type array  instead of having all the elements
//from the array passed into the constructor
//so fortunately kotlin provides the way to get back  to the vararg from the array here
//that is so called "SPREAD OPERATOR" (*)
//THIS * OPERATOR IS GOING to make this array here back to vararg so that what you pass in here to the constructor is
// not a vararg of elemnt type of t

fun <T> stackof(vararg element:T):Stack<T>{
    return  Stack(*element)

}
fun  main(args:Array<String>){
    val stack =Stack(1,4,7,8,0)
    val stack2 = stackof("hi", "hey", "hello")
    for (i in 1..3){
        println(stack2.pop())
    }
    stack.push(11)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    //here you will get out of index  exception for that we will right a fun
    println(stack.pop())




}