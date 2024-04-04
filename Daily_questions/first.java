class FFirst{
	public static void main(String... args){
	try{
	System.out.println(args[0]);
	}
	catch(Throwable e){
	Throwable t = new Throwable("Eception");
	System.out.println(e);
	System.out.printf("stackTrace: ");
	e.printStackTrace();
	System.out.println("getMessage(): "+e.getMessage());
	System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
	System.out.println("getCause(): " + e.getCause());
	System.out.println("getStackTrace(): " + e.getStackTrace());
        e.addSuppressed(t);
    	System.out.println("getSuppressed(): " + e.getSuppressed());	
    	  e.addSuppressed(t);
    	System.out.println("toString(): " + e.toString());
        System.out.println(" fillInStackTrace(): "+e.fillInStackTrace());

    	 	
    	 
	}
	}
}
