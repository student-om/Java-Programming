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
	catch(ArrayIndexOutOfBoundsException e){   // this is a run time exception
	System.out.println("wrong index");
	}
	//2 ArrayIndexOutOfBoundsException ARE also not allowed
	catch(InterruptedException e){  //this is a compile time exception
	System.out.println("InterruptedException found");
	}
	catch(Exception e) {
	System.out.println("Exce[tion found");
	}
	
	}
}
