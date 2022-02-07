package oo

//Let’s say we’re running a library where you can lend books and also some
//movies. We want to write an application to keep track of our inventory.
//Create an interface Lendable that defines a borrow() method. Then create an
//abstract class InventoryItem and two classes Book and DVD which inherit from
//InventoryItem. InventoryItem should implement the Lendable interface.
//Books and DVDs both have a title, genre and publication year. Books also have
//an author whereas DVDs have a length in seconds. Add each property to the
//most suitable class.

interface Lendable{
    fun borrow()
}
abstract class InventoryItem(open val title:String, open val genre:String, open val pubyear:Int):Lendable{

}
data class Books(val author:String,override val title: String, override val genre: String,
            override val pubyear: Int):InventoryItem(title, genre, pubyear){

    override fun borrow() {
        print("implemented in Books class")
    }
}
data class DVD(val length:Int,override val title: String, override val genre: String,
            override val pubyear: Int):InventoryItem(title, genre, pubyear){

    override fun borrow() {
        print("implemented in DVD class")
    }
}
fun main(args:Array<String>){

    val book = Books("xyz","random","random",2004)
    val dvd = DVD(20,"ABC","random",2004)
    println(book)
    book.borrow()
    println()
    println(dvd)
    dvd.borrow()
}