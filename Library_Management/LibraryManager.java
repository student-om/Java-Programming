package Library_Management;

import java.util.ArrayList;

public class LibraryManager {
    public static ArrayList<Book> storedBooks = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();
    // private static int studentCount = 0;
    // private static int bookCount = 0;


    //Function to add a book in Library
    public static void addBook(long serialNumber, String bookName, String author, int quantity) {
        Book b1 = new Book(serialNumber, bookName, author, quantity);
        storedBooks.add(b1);
        // bookCount++;
    }

    //Function to display all books available in library
    public static void displayBooks() {
        System.out.println("\n-----------------------\nAvailable Books:");
        for (Book aBook : storedBooks) {
            if (aBook != null) {
                System.out.println(aBook.serialNumber + "\t" + aBook.bookName + "\t" + aBook.author + "\t" + aBook.quantity);
            }
        }
    }
    
    //Function to add a student in student's list
    // public static void addStudent(Student student) {
    //     students.add(student);
        
    //     // studentCount++;
    // }
    
    //Function to find a book by its serial number
    public static Book findBookBySerial(long serialNumber) {
        for (Book book : storedBooks) {
            if (book != null && book.serialNumber == serialNumber) {
                return book;
            }
        }
        return null; 
    }

    //Function to find a student by its serial number
    public static Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student != null && student.userId == studentId) {
                return student;
            }
        }
        return null; 
    }

    //Function to increase book count whenever a book is submitted
    public static void increaseBookCount(Book book) {
        for (Book storedBooks : storedBooks) {
            if (storedBooks != null && storedBooks.serialNumber == book.serialNumber) {
                // Found the book in the library's stored books
                storedBooks.quantity++; // Increase the book count
                System.out.println("Book count increased successfully.");
                return;
            }
        }
        System.out.println("Book with serial number " + book.serialNumber + " not found in library's list.");
    }

    //Function to reduce book count whenever a book is taken2
    public static void decreaseBookCount(Book book) {
        for (Book storedBooks : storedBooks) {
            if (storedBooks != null && storedBooks.serialNumber == book.serialNumber) {
                // Found the book in the library's stored books
                storedBooks.quantity--; // decrease the book count
                return;
            }
        }
        System.out.println("Book with serial number " + book.serialNumber + " not found in library's list.");
    }
    
}
