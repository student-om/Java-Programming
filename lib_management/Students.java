import java.util.Scanner;
 
// Class
public class Students {
 
    // Creating objects of Scanner and Students class
    Scanner input = new Scanner(System.in);
    Student theStudents[] = new Student[50];
 
    public static int count = 0;
 
    // Method 1
    // To add Books
    public void addStudent(Student s)
    {
        for (int i = 0; i < count; i++) {
 
            if (s.regNum.equalsIgnoreCase(
                    theStudents[i].regNum)) {
 
                // Print statement
                System.out.println(
                    "Student of Reg Num " + s.regNum
                    + " is Already Registered.");
 
                return;
            }
        }
 
        if (count <= 50) {
            theStudents[count] = s;
            count++;
        }
    }
 
    // Method 2
    // Displaying all Students
    public void showAllStudents()
    {
        // Printing Student name and
        // corresponding registered number
        System.out.println("Student Name\t\tReg Number");
        for (int i = 0; i < count; i++) {
 
            System.out.println(theStudents[i].StudentName
                               + "\t\t"
                               + theStudents[i].regNum);
        }
    }
 
    // Method 3
    // To check the Student
    public int isStudent()
    {
        // Display message only
        System.out.println("Enter Reg Number:");
 
        String regNum = input.nextLine();
 
        for (int i = 0; i < count; i++) {
 
            if (theStudents[i].regNum.equalsIgnoreCase(
                    regNum)) {
                return i;
            }
        }
 
        // Print statements
        System.out.println("Student is not Registered.");
        System.out.println("Get Registered First.");
 
        return -1;
    }
 
    // Method 4
    // To remove the Book
    public void checkOutBook(Books Book)
    {
        int StudentIndex = this.isStudent();
 
        if (StudentIndex != -1) {
            System.out.println("checking out");
 
            Book.showAllBooks();
            Book b = Book.checkOutBook();
 
            System.out.println("checking out");
            if (b != null) {
 
                if (theStudents[StudentIndex].BooksCount
                    <= 3) {
 
                    System.out.println("adding Book");
                    theStudents[StudentIndex].borrowedBooks
                        [theStudents[StudentIndex]
                             .BooksCount]
                        = b;
                    theStudents[StudentIndex].BooksCount++;
 
                    return;
                }
                else {
 
                    System.out.println(
                        "Student Can not Borrow more than 3 Books.");
                    return;
                }
            }
            System.out.println("Book is not Available.");
        }
    }
 
    // Method 5
    // To add the Book
    public void checkInBook(Books Book)
    {
        int StudentIndex = this.isStudent();
        if (StudentIndex != -1) {
 
            // Printing credentials corresponding to Student
            System.out.println(
                "S.No\t\t\tBook Name\t\t\tAuthor Name");
 
            Student s = theStudents[StudentIndex];
 
            for (int i = 0; i < s.BooksCount; i++) {
 
                System.out.println(
                    s.borrowedBooks[i].sNo + "\t\t\t"
                    + s.borrowedBooks[i].BookName + "\t\t\t"
                    + s.borrowedBooks[i].authorName);
            }
 
            // Display message only
            System.out.println(
                "Enter Serial Number of Book to be Checked In:");
 
            int sNo = input.nextInt();
 
            for (int i = 0; i < s.BooksCount; i++) {
                if (sNo == s.borrowedBooks[i].sNo) {
                    Book.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;
 
                    return;
                }
            }
 
            System.out.println("Book of Serial No " + sNo
                               + "not Found");
        }
    }
}
