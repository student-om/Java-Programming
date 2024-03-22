class Program1_7{
	public static void main(String args[]){
	int i = 25;
	// Check if i is between 0 and 10
	if (i >= 0 && i <= 10)
	System.out.printf("i is between 0 and 10");
	// Since i is not between 0 and 10
	// Check if i is between 11 and 15
	else if (i >= 11 && i <= 15)
	System.out.printf("i is between 11 and 15");
	// Since i is not between 11 and 15
	// Check if i is between 16 and 20
	else if (i >= 16 && i <= 20)
	System.out.printf("i is between 16 and 20");
	// Since i is not between 0 and 20
	// It means i is greater than 20
	else
	System.out.printf("i is greater than 20");
	}
}
