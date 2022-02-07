package oo

//here we will learn DATA CLASSES. some time we need classes just to store the data only properties and no functionalities
//like you can just keep on creating the object of it with data  for ex book class in that case it is better to use data class
//starting with creating a normal class and then u cont creating it objects to store the different books

//we can create normal method behaviour in ata class a swell

class classBook(val name: String,val author:String, var Price:Double){

    override fun toString(): String {
        return "classBook[name=$name, author=$author, Price=$Price]"
    }
}

data class DataBook(val name: String,val author:String, var Price:Double){

}

fun main(args:Array<String>){

    //when you run the below codes  the normal class object will print some random string whereas the dataclass object will
    //print the value as by default it implement to string method , for other class you need to define that explicitly
    //oo.classBook@30c7da1e
    //DataBook(name=Super book, author=Jhon doe, Price=99.0)
    val book = classBook("Super book","Jhon doe", 99.00)
    val book1 = classBook("Super book","Jhon doe", 99.00)
    val databook = DataBook("Super book","Jhon doe", 99.00)
    val databook1= DataBook("Super book","Jhon doe", 99.00)

    println(book)
    println(databook)

    //another difference is it can be compared like if you compare book and book 1 it will give false for that we need to implement equals method  but if you
    //compare dataclass objects dataclass1 and dataclass then it will give true as it will compare the property value with one another
    println(databook.equals(databook1))
    println(book.equals(book1))

    //also what you can do is copy the object value to new object thus creating a new object in concise way
    //it give us copy method
    val dataBook3 = databook.copy(Price = 89.00)
    println(dataBook3)

    //also you can save each of the dataclass object properties into distinct variables
    //like you can say decompose the object into their specific properties
    val (name,author,Price)=databook
    println(name)
    println(author)
    println(Price)

    //one more really important thing about data classes that it allows us to use it with data types which use hashing
    //so we can create a hash set or hash map that contains the object of these data classes. So we could create the
    //set of books by using the hashset of and then we could say databook 1 , 2 3..and this would create a set of books very similar to list
// set cant contain duplicate but databook 3 is copy of data book
    //but in normal class objects it will not remove the duplicate objects
    val setbook = hashSetOf(dataBook3,databook,databook1)
    val set2 = hashSetOf(book,book1)

    println(setbook)
    println(set2)


}