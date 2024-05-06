//Exception Handling
class Try{
String str = "hello";
	public static void main(String args[]){
	Try t = new Try();
	try{
	System.out.println("Inside Try Block");
	t.str.charAt(7);                   // ye bhi chalega
	
	}
	catch(StringIndexOutOfBoundsException sei){
	System.out.println("Caught the exception");
	System.out.println(sei);
	}
	
	finally{
		System.out.println("Done");
	}
	
	}
}

/*  Method1 is in main block 
You write try block in method (Method1) of a class 
and you write catch block in main method 
this  will give you an error;
because you need to add catch block in the Method1 as the exception needs to be handled within class if try and catch are used
 */
