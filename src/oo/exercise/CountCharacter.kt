package oo.exercise

class CountCharacter {

    fun getCharCount(string:String):HashMap<Char,Int>{
        var charCount= hashMapOf<Char,Int>()
        var count =1
        for (s in string.lowercase()){
            if (charCount.contains(s)){
                charCount.put(s,++count)
            }else{
                charCount.put(s,count)
            }
        }
        return charCount
    }
}
fun main(args:Array<String>){
    val a = CountCharacter()
    println(a.getCharCount("Test"))
}