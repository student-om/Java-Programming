class Program1_9{
	public static void main(String args[]){
	int i;
	for(i=0;i<10;i++)
	{
	if(i==5)
	{
	System.out.printf("Coming out of for loop when i = 5\n");
	break;
	}
	System.out.printf("%d\n",i);
	}
		
		
		
	//continue
	int j;
	for(j=0;j<10;j++)
	{
	if(j==5 || j==6)
	{
	System.out.printf("Skipping %d from display using /n continue statement \n",j);
	continue;
	}
	System.out.printf("%d\n",j);
	}	
	}	
	}
