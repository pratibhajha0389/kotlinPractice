//here we will study loops - to use for loops we should know before hand how many number of iteration we need
//unless you are using array or array list
//i.e for loops allows us to repeat the number of code fo specific time and in while loop we dont need to know how many
// number of iterations in advance we need. so for ex - we want to read text book but line by line and we dont know how many lines are in the book or
// when the file is gonna end

fun main(){

    var sum = 0;
    for(i in 1..100){
        sum=sum+i

    }
    println(sum)

    val list1 = listOf("java", "python", "kotlin")
    for (element in list1){
        println(element)
    }

    for ((index,value) in list1.withIndex()){
        println("at index $index the value is $value")
    }

    var x= 9
    while (x>=0){
        println(x)
        x--
    }

    //break operator allows to jump to end of the loop , so this useful when we are interested in first occurrence of something
// and continue operator used to jump to next iteration i.e. it skips one iteration and starts right with the next iteration inside our loop
    // so that you can avoid the unnecessary calculations for variables which are not suitable for ex u check user first and only active user can be further calculated
    // if any inactive user appears you continue

    for(c in "python"){
        if(c == 'o'){
            break
        }
        else{
            print(c)
        }
    }
    println()
    val list2 = listOf("book", "table", "door")
    //now i wanna work with values which have "o" and skip the unnecessary calculation for words which don't have "o"
    for (str in list2){
        if (!str.contains('o')){
            continue
        }else{
            println(str)
        }
    }

    //Naming a loop - so lets take an example - in below code i am writing two loops with a condition and break statement '
    //now we dont know which loop it will break - so when you run it will break the inner loop and continue again from outer
    // so if you want to get out of outer loop what will you do - check the next loop
    for (i in 1..10){
        for (j in 1..10){
            if (i-j==5){
                break;
            }
            println("$i - $j")
        }
    }

    //second loop with naming to get out of outer loop "outer can be replaced with any name "

    outer@ for (i in 1..10){
        for(j in 1..10){
            if (i-j==5){
                break@outer
            }
            println("$i - $j")
        }
    }

    //For this challenge, try to write a program that calculates the sum of all
    //numbers from 100 to 100,000 and prints out the result.

    var sum1 =0L;
    for (i in 100..100000){
        sum1 = sum1+i
    }
    println(sum1)


    //Create an array list of your favorite book titles. Loop over this list and, if
    //the title contains the letter ‘e’, print each character of the name on a new
    //line.

    var booklist = arrayListOf("Meluha", "java", "python")

    for (str in booklist){
        if (!str.contains('e')){
            continue
        }else{
            println(str)
            for (char in str){
                println(char)
            }
        }
    }


}