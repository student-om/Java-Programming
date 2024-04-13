//import java.util.scanner;

interface mess{

void rate();

}




class Boy implements mess{
	public void rate(){
	int rate = 2400;
	System.out.println("You have to pay "+rate+" per month ");

	}
}

class Girl implements mess{
	public void rate(){
	int rate = 1500;
	System.out.println("You have to pay "+rate+" per month ");
	}
}

class Hess {
	public static void main(String args[]) throws Exception{
	Class c = Class.forName(args[0]);
	mess Myref = (mess)c.newInstance();
	Myref.rate();
	
	}

}








