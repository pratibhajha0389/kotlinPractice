package oo.exercise

import java.util.*

class FindMissingElement {

    //ARRAY (1,2,3,4,5,7,8,10)
    fun findMinMaxFromArray(arr: Array<Int>) : Pair<Int,Int> {
        // Fetches the Minimum and Maximum element from Array
        var min:Int=99999
        var max = -1
        for (i in arr) {
            if (i > max){ max=i }
            if (i < min){ min=i }
        }
        return Pair(min,max )
    }
    fun reArrangeGivenArraySortedOrder(arr: Array<Int>,min: Int,max:Int) : IntArray {
        var reArrangedArray = IntArray( (max-min)+1 )
        var index:Int
        for (i in arr){
            index = i-min
            reArrangedArray.set(index,i)
        }
        return reArrangedArray
    }
    fun getMissingElementsFromArray(arr: Array<Int>): MutableList<Int> {
        /*
            Gets the Min & Max Element of Array.
            As each subsequent number gets incremented by 1 - we can re-arrange it in
            a sorted order with array of size (max - min) + 1 - with first element being min
            second being min+1 ( if it exists ) and so on
            Indexes for which Array Value Stays 0 - it means corresponding element not found in original array
            are the one's missing ( Number would be min + index of Re-Arranged Array
            Assumption :
                Min and Max Element should be present - i.e. given array should depict the upper and lower bound
                Won't Work if 0 itself is missing - Need to be fixed
         */
        val( min, max) =findMinMaxFromArray(arr)
        //println("max $max")
        // println("min $min")

        var reArrangedArr:IntArray = reArrangeGivenArraySortedOrder(arr,min,max)
        // println(Arrays.toString(reArrangedArr))

        var missingElementArray : MutableList<Int> = mutableListOf<Int>()

        for ((index,value) in reArrangedArr.withIndex()){
            if (value==0){
                missingElementArray.add(min+index)
            }
        }
        return missingElementArray
    }
}
fun main(args:Array<String>){

    val a = FindMissingElement()
    //val b = arrayOf(1,2,3,4,5,7,8,10)
    val b = arrayOf(-2,-1,0,1,3)
    println(a.getMissingElementsFromArray(b))
}