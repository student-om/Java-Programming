import java.util.Scanner;
class Program2_2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s1 = "Hello";
	String s2;
	do{
	System.out.println("Enter your String");
	s2=sc.nextLine();
	}while(s1.equals(s2)==false);
	System.out.println("Now the Strings are equal");
	}
}
