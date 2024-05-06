interface Voter{
int x = 10;
	 void castVote();  // abstract likho ya na likho error nahi ayega
}

interface EC {
	void checkVailidityOfVoter(int age) throws InvalidVoter;
}


class ECIndia implements Voter, EC{
	//int x = 100; object of ECIndia will give a 100 if value of x is printed(that's why use reference of the instance) 
	final int minAge;
	
	ECIndia(int minAge){
		this.minAge = minAge;
	}

	public void castVote(){
		System.out.println("In CastVote:: ECIndia");	
	}
	
	public void checkVailidityOfVoter(int age) throws InvalidVoter{
		if(age < minAge){
			throw new InvalidVoter("Invalid Voter");
		}
	}
}

class ECBrazil implements Voter, EC{
	public void castVote(){
		System.out.println("In CastVote:: ECBrazil");	
	}
	
	public void checkVailidityOfVoter(int age){
		
	}
}


class Election2024{
	public static void main(String ...args){
		ECIndia ecIndia = new ECIndia(18);
		//ecIndia.checkVailidityOfVoter(4);  yaha Exception ayega(user-defined) niche ke statements execute nahi honge 
		System.out.println(ecIndia.x);
		//System.out.println(ecIndia.x++); yaha error ayega b/c we cannot modify static final variable of interface
	}
}


class InvalidVoter extends RuntimeException{
	InvalidVoter(String error){
		super(error);
	}
}

//in place of RuntimeException you write Exception
//as Exception class contains unchecked exception it will check at compile it will give error when throws is not written 
//on side of Method name on line number 22,7,41
//if try and catch is used then exceptions will be handled inside check...(int age) method and there is no need to use throws
//keyword anywhere 
// error: checkVailidityOfVoter(int) in ECIndia cannot implement checkVailidityOfVoter(int) in EC


//public void checkVailidityOfVoter(int age) throws InvalidVoter{ you Used Exception instead of RuntimeException
//	            ^
 // overridden method does not throw InvalidVoter
 //this error comes when when throws is not used on line 6 but used on line no  22 and 41
 
 
 //you are using RuntimeException and you didn't write throws keyword beside line number 22,41,7 then still the code will get 
 //compiled 
 
 

