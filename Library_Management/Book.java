package Library_Management;
//Book class for a book object
public class Book {
    public long serialNumber;
    public String bookName;
    public String author;
    public int quantity;
    
    public Book(long serialNumber, String bookName, String author, int quantity) {
        this.serialNumber = serialNumber;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
    }
}
