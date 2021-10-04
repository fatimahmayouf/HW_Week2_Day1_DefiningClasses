fun main() {
    var book1 = Books("Game of Thrones", "bbGeorge Martin", 54.0)

    println("${book1}")


         println(book1.bookDetails(true))



    var book2 = Books("We Were Liars", "E. Lockhart", 30.00)
    println("$book2")
    println(book2.bookDetails(false))
}

class Books(title: String, auther: String, price: Double) {

    fun bookDetails(inStock: Boolean): String {
        if (inStock == true)
            return "Availability: In stock"
        else {
            return "Availability: In stock"
        }
    }
}