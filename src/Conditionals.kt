fun main(){
    var age:Int=29
    if (age <18){
        println("you cant register")
    }else if (age <25){
        println("you still cant register")
    }else if (age <27){
        println("you might register")
    }else{
        println("you can register")
    }
    println("end of the loop")

    // practicing WHEN so we use "when" for switching the execution behaviour and if else is used mainly
    // for arbitary conditions like we have user object so it can be  if(user.loggedin)
    //but remember if statements are more powerful than when statements as whatever you can achieve by "when" can be done by "if"
    //if we talk about the expression that means the  line of code that has value example 3<5 it will have true or false
    // or "somerandomstring" or mode (as below) this expression has a value
    //Now statement is something like  which doest have a value like println("jhjhj") it tells kotlin to print something

    var mode:Int=7
    when(mode){
        1 -> println("this mode is 1 less productive")
        2 -> {
            println("this mode is 2")
            println("this mode is little more productive")
        }
        3 -> println("this mode is super productive")
        else -> println("not sure about this mode")
    }

    //till as of now we were talking abut if statement and when statements but in Kotlin these are expressions
    //like if i store the above when code as var result= whe(mode).....else -> println("bhjh")} as per above code the
    //kotlin will give warning as right hand side is statement with print but if i do var result = when(mode){ 1-> "gfgfg"}
    //it will come expression and kotlin will not give warning
    //also the last expression it will pick if multiline as in mode 2 but if you put expression and print it will execute all line of mode 2
    var mode1:Int=2
    var result = when(mode1) {
        1 -> "this result mode is 1 less productive"
        2 -> {
            //"this result mode is 2"
            println("this result mode is 2")
            var a:Int=3
            "this result mode is little more productive"
        }
        3 -> "this result mode is super productive"
        else -> println("not sure about this result  mode")
    }
    println(result)

    //Now creating If as an expression above we practiced when as an expression and statement and if as a statement
    //The value of the if expression is defined in the last line of each block.

    var x = if (mode1 >10) {
        println("out of scope")
        17
    }else{
        42
    }
    print(x)

    //some more things to do with WHEN expression here we will not be returning anything but what more we can
    //do with when statement . It can be used as switch statement but you don't require break statement here

    var a =11                            //or     var a:Int=2
    when(a){
        5-> println("val of a is 5")
        3*5 -> println("val of a 3*5")
        is Int-> println("a is long type")
        "hey there".length -> println("a is the length of the string \"hey there\"")
        in 1..9 -> println("value of a exist between 1 to 9 and this is how it is specified")
        in 11..20 -> println("value of a lies between 11 to 20 and this is how it is specified")
        //any statement above is true than it will break and will not  run the other statement irrespective of if that is true or false
        !in 11..20 -> println("value of a does not lie between 11 to 20 and thats how it is written")
    }



}
