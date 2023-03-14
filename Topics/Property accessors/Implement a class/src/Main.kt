class LewisCarrollBook {

    var name: String = ""
        get() {
            println("The name of the book is $field")
            return field
        }
        set(value) {
            field = value
            println("Now, a book called $field")
        }

    var author: String = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }

    var price: Int = 0
        set(value) {
            println("Putting a new price...")
            field = value
            println("The new price is $field")
        }

}
/*
fun main() {
    val lewisCarrollBook = LewisCarrollBook()
    var bookName = lewisCarrollBook.name
    lewisCarrollBook.name = "Alice's Adventures in Wonderland"
    bookName = lewisCarrollBook.name
    var authorName = lewisCarrollBook.author
    var bookPrice = lewisCarrollBook.price
    lewisCarrollBook.price = 1500
}*/