package oo.io

import java.io.File

fun main(args:Array<String>){
    val ipToCount = mutableMapOf<String,Int>()
    File("C:\\Users\\Prats\\Documents\\kotlinStudy\\src\\60.ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it,0)
        ipToCount.put(it,previous+1)
    }

    // now this below code can be reduced in one line in kotlin
    var maxIP = ipToCount.keys.first()
    var  maxCount=0
    for ((ip,count) in ipToCount.entries){
        if (count>maxCount){
            maxCount=count
            maxIP=ip
        }
    }
    println("most frequent ip is $maxIP with max occurence of $maxCount times")

    //updated way >> you can use max by on which you want to compute
    val(maxipAddress,maxcountofip)=ipToCount.entries.maxByOrNull { it.value }!!
    println("Updated code output :  most frequent ip is $maxIP with max occurence of $maxCount times")

}