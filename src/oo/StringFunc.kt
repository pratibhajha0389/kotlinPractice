package oo

open class StringFunc {
//String="My name is ram 23192 & i work at TCS $$@~"

    fun uniqueChar(stringUsed: String) {
        var myList = mutableSetOf<Char>()

        for (char in stringUsed) {

            if (char in 'A'..'Z' || char in 'a'..'z') {

                myList.add(char.lowercaseChar())


            }
        }
        for (element in myList!!) {
            print(element)

        }
println()
    }
    fun uniqueNumber(stringUsed: String) {

        var res = stringUsed.replace("[^0-9]".toRegex(), "")
        var myList = mutableSetOf<Int>()

        for (char in res) {

               myList.add(char.digitToInt())

        }
        for (element in myList!!) {
            print(element)

        }

    }

    fun uniqueSpecialChar(stringUsed: String){
        var res = stringUsed.replace("[(A-Za-z0-9 )]".toRegex(),"")
        var mySet = mutableSetOf<Char>();
        for (char in res){
            mySet.add(char)
        }
        println(mySet)
    }
}

    fun main(args:Array<String>) {
        var newString: String = "My name is ram 23192 & i work at TCS $$@~"

        /*var res = newString.replace("[^0-9]".toRegex(), "")
        var res2 = newString.replace("[(A-Za-z0-9 )]".toRegex(),"")

        println("printing  only number " + res)
        println("printing  only special characters "+res2)*/


      val fc = StringFunc()
        fc.uniqueChar(newString)
        fc.uniqueNumber(newString)
        println()
        fc.uniqueSpecialChar(newString)
    }
