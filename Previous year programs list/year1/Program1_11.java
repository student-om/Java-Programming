class Program1_11{
	public static void main(String args[]){
	int n=1234, reverse=0, rem;
	
	
	while(n!=0)
	{
	rem=n%10;
	reverse=reverse*10+rem;
	n/=10;
	}
	System.out.printf("Reversed Number = %d",reverse);
		}

}



//4   4*10+3    43*10+2  432*10+1=4321
