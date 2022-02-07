package oo

import kotlin.reflect.jvm.internal.ReflectProperties

//so enumeration will help prevent the type cast or allow you to
// restrict with specific values liek apart from 7 days weekday cant be anything else
//and if you use class week then  while creating its object the week  can be anything any random or if you want only uppercase
//it can be created as object with lowercase value of week day
//lets say there was colors class and there is enum
class Colors{
 val Red = 1
    val green = 3
}

enum class colors2{

     RED, GREEN,BLUE
}

//also you can define properties for each color

enum class Colors3(val rgb : Int){
    RED(0XFF0000),GREEN(0X00FF00),BLUE(0X0000FF), YELLOW(0XFFFF00);
     fun containsRed():Boolean{
        return this.rgb and 0XFF0000 !=0
    }
}

fun main(args:Array<String>){
    val a = Colors()
    val b = a.Red
   // val d= colors3.0XFF0000
    val c = colors2.BLUE
    print(Colors3.BLUE.containsRed())
    print(Colors3.RED.containsRed())
    print(Colors3.YELLOW.containsRed())
}
