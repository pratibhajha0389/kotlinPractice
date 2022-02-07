package oo.io

import java.io.File

fun main(args:Array<String>){
    var linenumber = 0

    //for eachline is like a loop
    File("src/oo/io/inputfile.txt").forEachLine {
        //each line we are saying "it" in kotlin
        ++linenumber
        println("#$linenumber : $it")
    }
}