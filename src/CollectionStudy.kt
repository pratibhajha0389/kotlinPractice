//we have array (fixed in size but val can change), array list (mutable like you can update the value of list), list (immutable i.e.
//cant update the values of list, string can be treated as array of characters
fun main(){
    var a: Array<Int> = arrayOf(1,2,3)
    var mixedArray = arrayOf("hjhj",3,3.56,false)
    var arr = intArrayOf(1,2,3)
    val b = arrayListOf(5,6,7)
    var c = listOf(8,9,10)
    b.add(9)
    //internaly mixedarray is using get and set methods, u can use that explicitly as well
    println(mixedArray[2])
    mixedArray[2]= 3.1456
    println(mixedArray[2])

    mixedArray.set(2,4.12)
    println(mixedArray.get(2))
    var str = "hjhj"
    println(str[0])

    //you can concatenate array but that has to be of same type

    val states = charArrayOf('e','f')
    val states2 = charArrayOf('g','h')
    val st = arrayOf("mumbai", "delhi")
    val st2 = arrayOf("banglore", "hydrabad")
    val st3 = st+st2
    println(states+states2)
    println(st3.size)

    var checkval:Boolean = mixedArray.isEmpty()
    println(checkval)
    if(st3.contains("Rajashtan")){
        println("st3 contains Rajasthan ")
    }else {
        println("st3 doesnot contain rajasthan")
    }

    //list
        //array list - mutable

    val statesList = arrayListOf("delhi", "mumbai", "hyd")
    val list2 = arrayListOf("banglore", "rajasthan")
    //concatenate a list
    val updatedList = statesList+list2

    println(updatedList)
    println(updatedList.size)
    println(updatedList[0])
    println(updatedList.isEmpty())
    println(updatedList.contains("banglore"))

    list2.add("Uttrakhand")
    val isListChanged = list2.add(0,"Himachal")
    println(list2)
    println(isListChanged)
    val isList2changes = list2.remove("itdoesnotexistinlist")
    println(isList2changes)

    //sublist
    println(list2)
    var subList1 = list2.subList(0,3)
    println(subList1)
    subList1 = list2.subList(1,2)
    println(subList1)
    subList1 = list2.subList(0,list2.size)
    println(subList1)
    subList1 = list2.subList(0,list2.size-1)
    println(subList1)


}