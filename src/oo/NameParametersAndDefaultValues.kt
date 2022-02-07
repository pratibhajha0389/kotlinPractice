package oo

class House(val height:Double,var color:String, var price: Int=50000){
    fun print(){
        println("house height is $height, color is $color and price is $price")
    }
}
//for your multiple constructor you can have default values to your parameter

fun main(args: Array<String>){

    val house =House(4.5, "red", 150000)
    val yellowhouse= House (height = 5.0, color = "yellow")
    val greenhouse = House(color = "green", price= 200000, height = 5.5 )

    house.print()
    greenhouse.print()
    yellowhouse.print()
}