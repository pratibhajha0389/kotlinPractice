package oo
//Create a class representing a book. Every book has a title, an author, a
//publication year and is either borrowed or not. Choose an appropriate
//data type for each of these properties.
//A book can be borrowed from you or returned to you. In both cases, the
//borrowed property is updated accordingly. Also, a book should be able
//to print itself to the command line, including its title, author, and
//publication year.
class Book(private val title:String, private val author:String, private val pubYear: Int, var borrowed: Boolean){


    init {
        val title= this.title
        val author = this.author
        val pubYear=this.pubYear

        println("the title of the book is $title")
        println("the author of the book is $author")
        println("the pubYear of the book is $pubYear")
    }

        fun BorrowBook():Boolean{
            if (borrowed){
                println("sorry! the book is already borrowed")
                return false
            }else{
                println("the book can be borrowed")
                return true
            }
        }
    fun returnBook():Boolean{
        if (borrowed){
            println("book is returned")
            borrowed=false
            return true
        }else{
            println("The book was not borrowed so it cannot be returned.")
            return false
        }
    }

}
fun main(args:Array<String>){


    val book=Book("java","hdsjh",2002, true)
    book.BorrowBook()
    book.returnBook()
    book.returnBook()
    book.BorrowBook()
    book.returnBook()

}