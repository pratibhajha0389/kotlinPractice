import com.sun.jdi.connect.Connector
import java.util.Date

//simple print no parameter and no return
fun helloworld(){
    println("hello world")
}

//"kotlin" -> k o t l i n  1 parameter string
fun addspace(text:String){
    for (char in text){
        print(char + " ")

    }
}
// return date return date type
fun getdate():Date{
    return Date()
}

//take input and return value -> max number
fun maxnumber(i:Int,b:Int):Int{
    if (i>b){
        return i
    }else{
        return b
    }
}

fun main(args : Array<String>){
    helloworld()
    addspace("i love kotlin")
    println()
    println(getdate())
    println(maxnumber(3,5))
}