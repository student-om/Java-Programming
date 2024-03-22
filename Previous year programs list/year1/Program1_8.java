class Program1_8{
	public static void main(String args[]){
        char grade = 'B';
	switch(grade) {
	case 'A' :
	System.out.printf("Excellent!\n" );
	break;
	case 'B' :
	case 'C' :
	System.out.printf("Well done\n" );
	break;
	case 'D' :
	System.out.printf("You passed\n" );
	break;
	case 'F' :
	System.out.printf("Better try again\n" );
	break;
	default :
	System.out.printf("Invalid grade\n" );
	}
	System.out.printf("Your grade is %c\n", grade );

 		}
}
