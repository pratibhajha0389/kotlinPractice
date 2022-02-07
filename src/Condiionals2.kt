import java.util.Random

//Generate a random number between 1 and 50 using the following code:
//val random = Random().nextInt(50) + 1
//IntelliJ helps you import the Random class from Java so that you can use it. Don’t
//worry about the details of imports for now.
//Now, use a when statement to switch between the cases where random is in
//the range 1 to 10, 11 to 20, 21 to 30, 31 to 40, or above 40. In each case, print out
//a message containing the range and the exact value of random.
//Test your code in a main() function and run it several times to get different
//random numbers.

fun main(){
    var randomVariable:Int = Random().nextInt(50)+16
    println(randomVariable)
    when(randomVariable){
        in 1..10 -> println("value between 1 to 10 ")
        in 11..20 -> println("value between 11 to 20 ")
        in 21..30 -> println("value between 21 to 30")
        in 31..40 -> println("value between 31 to 40")
        in 41..50 -> println("value between 41 to 50")
        else -> println("value out of range")
    }

}