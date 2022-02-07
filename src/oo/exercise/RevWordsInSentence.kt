package oo.exercise

class RevWordsInSentence{

    /*fun revWords(stringSentence:String){
       // var res2= stringSentence.toList()
       *//* var temp:String=""
        var list1= mutableListOf<String>()*//*


        *//*    for (char in res2) {
                if (char != ' ') {
                    temp += char

                } else {
                    list1.add(temp)
                    temp = ""
                }
                if (it == res2.last()){
                    list1.add(temp)
                }
            }*//*
               println(list1)

    }*/


    fun revwords(string1 : String){
        var revString:String=""
       // var stk = stackof<String>()
        var arr = mutableListOf<String>()
        for (words in string1.split(" ")){
         //   stk.push(words)
            arr.add(words)
        }
       /*while (!stk.isEmpty()){
           while (!stk.isEmpty()){
           //stk.pop()?.reversed()
           revString += stk.pop()?.reversed()+" "
       }*/
        for (word in arr){
            revString += word.reversed()+ " "
        }
        println(revString)
    }

}

fun main(args:Array<String>){

    var res: String ="This is a bright day, Good Morning"
    //var res: String ="N H N"
   /* var res2= res.toList()
    println(res2)
    println(res2)*/
    var obj = RevWordsInSentence()
    obj.revwords(res)

}