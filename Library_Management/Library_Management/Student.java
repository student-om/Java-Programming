package Library_Management;

import java.util.Scanner;

public class Student extends User {
    static Book[] tookBook = new Book[5];
    static Scanner sc = new Scanner(System.in);

    //comctructor for student object
    public Student(String userId) {
        super(userId);
        LibraryManager.students.add(this);
    }

    //Function to show all available student options
    public void studentOptions() {
        while (true) {
            System.out.println("1)Take a book\n2)Show available books\n3)Show taken books\n4)Return a book\n5)Renew a book\n8)Change user\n Press 0 to exit:");
            int choice = sc.nextInt();
            executeOperation(choice);
        }
    }
    
    //Function to execute student's operations
    private void executeOperation(int choice) {
        switch (choice) {
            case 1:
                takeBook();
                break;
            case 2:
                LibraryManager.displayBooks();
                break;
            case 3:
                displayBooksTaken(tookBook);
                break;
            case 4:
                System.out.println("Enter book serial number to submit: ");
                long choice2 = sc.nextInt();
                submitBook(choice2);
                break;
            case 5:
                renewBook();
                break;
            case 6:
                break;
            case 7:
                LibraryManager.displayBooks();
                break;
            case 8:
                Library.main(null);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    //Function to display books taken by students
    private void displayBooksTaken(Book[] tookBook) {
        System.out.println("Books taken by user " + userId + ":");
        for (Book book : tookBook) {
            if (book != null) {
                System.out.println(book.serialNumber + "\t" + book.bookName + "\t" + book.author);
            }
        }
    }

    //Function to take a book
    public void takeBook() {
        
        System.out.println("Enter the serial number of the book you want to take:");
        long serialNumber = sc.nextLong();
        Book book = LibraryManager.findBookBySerial(serialNumber);
        if (book != null) {
            addBookToList(book);
        } else {
            System.out.println("Book with serial number " + serialNumber + " not found.");
        }
        }

    //Function to add a book in students taken book list
    public void addBookToList(Book book) {
        for (int i = 0; i < tookBook.length; i++) {
            if (tookBook[i] == null) {
                
                if (!bookExistsInList(book)) {
                    tookBook[i] = book;
                    LibraryManager.decreaseBookCount(book);
                    System.out.println("Book added successfully to your list.");
                    return;
                } else {
                    System.out.println("You already have this book in your list.");
                    return;
                }
            }
        }
        System.out.println("Sorry, you cannot add more books. Your list is full.");
    }

    //Function to check if the book already exists in list
    private boolean bookExistsInList(Book book) {
        for (Book existingBook : tookBook) {
            if (existingBook != null && existingBook.serialNumber == book.serialNumber) {
                return true;
            }
        }
        return false;
    }



    //Function to submit a book in library
    public void submitBook(long serialNumber) {
        for (int i = 0; i < tookBook.length; i++) {
            if (tookBook[i] != null && tookBook[i].serialNumber == serialNumber) {
                // Found the book in the student's list
                Book submittedBook = tookBook[i];
                tookBook[i] = null; // Remove the book from the student's list
                System.out.println("Book submitted successfully.");
                LibraryManager.increaseBookCount(submittedBook); // Increase the book count in LibraryManager's list
                return;
            }
        }
        System.out.println("Book with serial number " + serialNumber + " not found in your list.");
    }

    

    
}
