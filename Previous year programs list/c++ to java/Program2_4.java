import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Program2_4{
	int Rollno;
	String name;
	int marks;
	char Grade;
	
	public void getUserData() throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Roll no");
	Rollno = Integer.parseInt(br.readLine());
	System.out.println("Enter your name");
	name = br.readLine();
	System.out.println("Enter your marks");
	marks = Integer.parseInt(br.readLine());
	}
	
	public void GradeCalculator(int marks){
	if(marks>=90 && marks<=100){
	System.out.println("your Grade is A+");
	}
	else if(marks>=80 && marks<90){
	System.out.println("your Grade is A");
	}
	else if(marks>=70 && marks<80){
	System.out.println("your Grade is B+");
	}
	else if(marks>=60 && marks<70){
	System.out.println("your Grade is B");
	}
	else if(marks>=50 && marks<60){
	System.out.println("your Grade is C");
	}
	else if(marks>=40 && marks<50){
	System.out.println("your Grade is D");
	}
	else{
	System.out.println("You are failed");
	}
	
	}
	
	public static void main(String args[]) throws IOException
	{
	Program2_4 student1 = new Program2_4();
	student1.getUserData();
	student1.getStudentDetails();
	student1.GradeCalculator(student1.marks);
	}
	
	public void getStudentDetails(){
	System.out.println("Your Roll no is "+Rollno);
	System.out.println("Your Name is "+name);
	System.out.println("Your marks is "+marks);
	
	}

}

//self developed code by om deshmukh(copyright free)
