package oo

fun main(args:Array<String>){
    //in maps we use key value pairs of object that is mapped with each other
    //imagine you want to store the name of people with age then you wnat to map each person name with the age

    val namesToAges = mapOf(Pair("peter", 32), Pair("jhon", 42))
    //or -> "to " here is infix operator to is method or infix operator
    val namesToAges2 = mapOf(
        "peter".to(32),
        "jhon" to 42
    )
    //check weather two maps are equal it will say true as it will check and compare each pair
    println(namesToAges == namesToAges2)
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    var countryToInhabitants = mutableMapOf(
        "Germany" to 80_80_00,
        "USA" to "2898989",
        "India" to 787878
    )
    countryToInhabitants.put("Australia" , 90_000)
    //incase your not sure if the map has that key or not like not sure if country to inhabitatnt map has australia or not then put

    countryToInhabitants.putIfAbsent("Serbia", 400000)
    //it will not make duplicate entry here
    countryToInhabitants.putIfAbsent("Serbia", 400000)
    //also if you use ifabsent and change the value it wont edit or update with new one
    countryToInhabitants.putIfAbsent("Serbia", 490000)

    println(countryToInhabitants)
    //if you want to updat ethe value then
    countryToInhabitants.put("Serbia",500000)
    println(countryToInhabitants)
    println(countryToInhabitants.contains("Serbia"))
    println(countryToInhabitants.contains("France"))
    println(countryToInhabitants.containsValue(1))
    //if used default and there is no key present then it will use default value
    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants.getOrDefault("France",0))

    //how to work with entries - it will check each entry of the map
    namesToAges.entries.forEach(){
        //using "it" just like file to read map entry by entry
        println("${it.key} is ${it.value} years old")
    }






}