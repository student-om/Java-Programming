class Program1_10{
	public static void main(String args[]){
	int n=5, count;
	int factorial=1;
	
	
	if ( n< 0)
	System.out.printf("Error!!! Factorial of negative number doesn't exist.");
	else
	{
	for(count=1;count<=n;++count) /* for loop terminates if count>n */
	{
	factorial*=count; /* factorial=factorial*count */
	}
	System.out.printf("Factorial = %d",factorial);
	}
		}
}
