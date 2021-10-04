fun main() {
    var book1 = Books("Game of Thrones", "bbGeorge Martin", 54.0)
    println("Name:${book1.title}")
    println("auther:${book1.auther}")
    println("price:\$${book1.price}")


         println(book1.bookDetails(true))



    var book2 = Books("We Were Liars", "E. Lockhart", 30.00)
    println("Name:${book2.title}")
    println("auther:${book2.auther}")
    println("price:\$${book2.price}")

    println(book2.bookDetails(false))
}

class Books(var title: String,var auther: String,var  price: Double) {

    fun bookDetails(inStock: Boolean): String {
        if (inStock == true)
            return "Availability: In stock"
        else {
            return "Availability: In stock"
        }
    }
}