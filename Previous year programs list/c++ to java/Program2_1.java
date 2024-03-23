class Program2_1{
 	public static void main(String args[]){
 	int fact=1,i,n;
	System.out.printf("enter your no");

	if(n<0)
	{
	System.out.printf("factorial not found");
	}
	else
	{
	for(i=1;i<=n;i++)
	{
	fact=fact*i;
	}
	}
	System.out.printf("factorial of the no is:%d",fact);

 	
 	}
 }
