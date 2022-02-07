fun main (args: Array<String>){
    var list2 = arrayListOf(1,3,5,7,9)

    println(rev(list2))
    println(rev2(list2))
}

//take the list of integers and reverse the list and print

fun rev(list:ArrayList<Int>):ArrayList<Int>{
    var list3= arrayListOf<Int>()
    for (i in 0..list.size-1){
        list3.add(list.get(list.size-1-i))
    }
    return list3
}

//another way
fun rev2(list:ArrayList<Int>):ArrayList<Int>{
    var list3= arrayListOf<Int>()
    for (i in list.size-1 downTo 0){
        list3.add(list.get(i))
    }
    return list3
}