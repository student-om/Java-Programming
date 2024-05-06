class Day1{
	public static void main(String args[]){
	try{
	Thread.sleep(1000);
	System.out.println("inside try");
	Thread.sleep(1000);
	System.out.println(args[0]);
	Thread.sleep(1000);
	System.out.println("Inside TRy2");
	}
	
	//catch(Exception e) ---> error will come(catch should be written at last)
	catch(ArrayIndexOutOfBoundsException e){   // this is a run time exception ifemen you remove this catch stil code compiles ans the statement gets printed(Unchecked exception)
	System.out.println("wrong index");
	}
	//2 ArrayIndexOutOfBoundsException ARE also not allowed
	catch(InterruptedException e){  //this is a compile time exception i.e if you remove this catch exception comes at compile-time(if there is also no Exception catch also)
	System.out.println("InterruptedException found");
	}
	catch(Exception e) {
	System.out.println("Exce[tion found");
	}
	
	}
}
