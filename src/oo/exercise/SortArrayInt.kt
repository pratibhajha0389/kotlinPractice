package oo.exercise


fun main(args:Array<String>){
    var arr = arrayListOf(1,4,2,9,5)
    val a = SortArrayInt()
    println(a.sort_Array(arr))

}

//sort the array ArrayList[1,4,2,9,5] --[1,2,4,5,9]

class SortArrayInt {


    fun sort_Array(ip_array: ArrayList<Int>): ArrayList<Int> {

        //will use merge sort
        //base case of recursive method
        if(ip_array.size<=1){
            return ip_array
        }
        //lets define right and left side of array, for that we would define the midpoint
        var midpoint:Int = ip_array.size/2
       var left= ArrayList<Int>()

      var rightSize :Int=  if (ip_array.size%2==0){
            midpoint

        }else {
            midpoint+1
        }
        var right=ArrayList<Int>()
        //Now we will populate the left and right array with values
        for (i in 0 until  midpoint){
            //left[i] = ip_array[i]
            left.add(ip_array[i])
        }
        for (j in 0 until  rightSize){
           // right[j] = ip_array[midpoint+j]
            right.add(ip_array[midpoint+j])

        }
        //declare new int array RESULT
        var result = ArrayList<Int>(ip_array.size)

        left = sort_Array(left)
        right =sort_Array(right)
        println(left)
        println(right)
         result = merge(left,right)
        println(result)
        return result

        }

    //helper function merge
    fun merge(left:ArrayList<Int>,right:ArrayList<Int>):ArrayList<Int>{
        var result=ArrayList<Int>(left.size+right.size)
        var leftpointer: Int =0
        var rightpointer: Int=0
        var resultpointer: Int=0
        //loop it while we have elements in either
        while (leftpointer < left.size || rightpointer < right.size) {
            if (leftpointer < left.size && rightpointer < right.size) {
                //Validate if element in left array is less than element in right array  the result will have left pointer value

                //Validate if element in left array is less than element in right array  the result will have left pointer value
                if (left[leftpointer] < right[rightpointer]) {
                    result.add(left[leftpointer++])
                  //  result[resultpointer++] = left[leftpointer++]
                } else {
                    result.add(right[rightpointer++])

                   // result[resultpointer++] = right[rightpointer++]
                }

            } else if (leftpointer < left.size) {
                result.add(left[leftpointer++])

               // result[resultpointer++] = left[leftpointer++]
            } else if (rightpointer < right.size) {
                result.add(right[rightpointer++])

               // result[resultpointer++] = right[rightpointer++]
            }
        }
        return result
    }
}