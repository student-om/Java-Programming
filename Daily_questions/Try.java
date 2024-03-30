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
