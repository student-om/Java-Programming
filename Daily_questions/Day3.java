abstract class Myclass{
abstract void calculate(double x);
}

class Sub1 extends Myclass{
//calculate square value
	void calculate(double x){
	System.out.println("Square"+(x*x));
	}
}

class Sub2 extends Myclass{
//calculate square root value
	void calculate(double x){
	System.out.println("Square"+Math.sqrt(x));
	}
}

class Sub3 extends Myclass{
//calculate cube value
	void calculate(double x){
	System.out.println("Square"+(x*x*x));
	}
}

class Day3{
	public static void main(String args[]){
	Sub1 sub1 = new Sub1(); 
	Sub1 sub2 = new Sub2();
	Sub1 sub1 = new Sub1();  
	
        sub1.calculate(3);
        sub2.calculate(4);
        sub3.calculate(5);
        
	}
}

/* 
abstrct class object cannot be created but sub class objects can be created
normal methods are valid in abstract class
if a method is an abstract method, then ut must be given an abstract heading

an abstraxt method is a method without any body .it is written when the same method has to perform different tasks depending
on the object calling it

an abstract class is a class that contains 0 or more abstract methods

we cannot create abstract method object but we can create a referance. as ref is of super class type
it can refer to  all the objects of the subclass and use their methods
eg--> Myclass ref;
ref = sub1;
sub1.calculate(3);
ref = sub2;
sub1.calculate(4);
ref = sub3;
sub1.calculate(5);

*/
