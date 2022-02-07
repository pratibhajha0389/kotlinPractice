package oo.io

//in hangman game the two users are there one user have to provide the word and second user will guess the word
//so whatever alphabet exist in that word sys will pop up that one until user guess all the alphabet or right word

fun main(args:Array<String>){

    print("enter the word to guess:  ")
    var word = readLine()
    if (word==null){
        println("No word given, game ended here")
    }
    for (i in 1..100){
        println()
    }
//now first we want to have all the letters that is input by first user and store that in set so that next user entered letter can be checked against it
//normalization
    val letters = word?.lowercase()?.toCharArray()?.toHashSet()
//TRee -> tree -> ['t', 'r', 'e','e']  - >  {'t','r','e'} -> output
    //so lets say i have word like TREE , now tree has only 3 distinct letters tre but the word is composed of 4 letters
    //so we have duplicate words but what i don't want is an array of duplicate words so i will use hashset (it does not have order
    //and no duplicates)

    //mutable means you can add or remove element from the set

    var correctGuess = mutableSetOf<Char>()
    var fails = 0

    //unless all the letters are not found

    while (letters!=correctGuess){

        //in while loop  the first thing i want to do is first print the number that has been guessed so far
        //and then __ dashes for the remaining not found letters or _ o_h__

            printExploredWord( word,correctGuess)
            println("\n#wrong guess : $fails\n")

            println("guess letter: ")
            val input = readLine()
            if (input==null){
                continue
            }else if (input.length!=1){
                println("please enter one letter")
                continue
            }
            if (word?.lowercase()?.contains(input.lowercase()) == true){
                correctGuess.add(input[0].lowercaseChar())
            }else{
                fails++
            }

        if (word != null) {
            printExploredWord(word,correctGuess)
        }


    }


    //when all the correct guesses has been guessed the fail count will be increases everytime the wrong guess is there
    println("number of wrong guesses $fails\n\n")
    println("well done!!")

}



fun printExploredWord(word: String?, correctGuess:Set<Char>){
    if (word != null) {
        for (Char in word.lowercase()){
            if (correctGuess.contains(Char)){
                print(Char+" ")
            } else{
                print("_ ")
            }
        }
    }

}

