package oo.io

import java.io.File

// challenge to read the file having logs of most used ip and tell which is the most used ip

fun main(args:Array<String>){

    val file = File("C:\\Users\\Prats\\Documents\\kotlinStudy\\src\\60.ips.txt")
    var count = 0
    var ip:String? = null
    var ipToCount = mutableMapOf<String,Int>()

    file.forEachLine {
         ip = it.trim()


        // ipToCount = mutableMapOf(ip to count)

            if (ipToCount.containsKey(ip)){

                ipToCount.put(ip!!,++count)
            }else{
                count=1
                ipToCount.putIfAbsent(ip!!,count)

            }

    }
    var max = 0
    var ipKey :String?=null
   // println(ipToCount)
    ipToCount.entries.forEach(){

        if (max<it.value){
            max=it.value
            ipKey=it.key

        }
    }
    ipToCount.entries.forEach(){
        if (it.value==max){
            println(it.key)
            println(it.value)
        }
    }

}