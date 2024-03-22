class Program1_6{
	public static void main(String args[]){
	float a=3, b=2, c=10;
	System.out.printf("Enter three numbers: ");
		
	if(a>=b && a>=c)
	System.out.printf("Largest number = %.2f", a);
	else if(b>=a && b>=c)
	System.out.printf("Largest number = %.2f", b);
	else
	System.out.printf("Largest number = %.2f", c);
		}
}
