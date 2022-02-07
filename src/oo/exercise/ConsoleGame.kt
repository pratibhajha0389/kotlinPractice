package oo.io

import java.util.*

//Console game is about guessing the right number - generate a random number and tell user the number guessed is right or wrong

fun main(args:Array<String>){

    val number = Random().nextInt(100)+1
    var input: String?
    var guess=-1
    while(guess != number){
        print("guess the number between 1 and 100: ")
        //to get input from teh user using readline() method
        input = readLine()
        if (input !=null){
            //can throe number format exception
            guess = input.toInt()
        }
         if (guess < number){
            println("too low")
        }else if (guess>number){
            println("too high")
        } else {
            println("bingo you guessed the right number $number")
        }
    }
}