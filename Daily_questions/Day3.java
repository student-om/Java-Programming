abstract class Myclass{
 abstract void calculate(double x);
}

 //abstract method_name(){body} i.e abstract declaration with body is invalid
class Sub1 extends Myclass{ // if Sub1 extends abstract class then it means it should contain at least 1 abstract method
//which we are overriding if not contained then there will be error(if calculate(double x) is not there or diff name is there)
//calculate square value
	void calculate1(double x){
	System.out.println("Square "+(x*x));
	}
}

class Sub2 extends Myclass{
//calculate square root value
	void calculate(double x){
	System.out.println("Square root "+Math.sqrt(x));
	}
}

class Sub3 extends Myclass{
//calculate cube value
	void calculate(double x){
	System.out.println("Cube "+(x*x*x));
	}
}

class Day3{
	public static void main(String args[]){
	Sub1 sub1 = new Sub1(); 
	Sub2 sub2 = new Sub2();
	Sub3 sub3 = new Sub3();  
	
        sub1.calculate(3);
        sub2.calculate(4);
        sub3.calculate(5);
      /*  Myclass ref;
        ref = sub1;
        ref.calculate(1);    => will also work (square will be calculated as sub1 is reference of Sub1 class)
	*/
	}
}

/* 
method does not have a body . Sub1 Sub2 Sub3 are the sub-classes where abstract method is implemented as per the requirement of the object

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

in abstract class => 
if a body of the method is not provided, then abstract keyword must be used beside that method(if not error comes)
if body provided , then it is also valid (then concept of inheritance comes into play and concept of override also => polymorphism) , i.e sub class object method will override super class object methof if sub class object is used.
for experiment add body remove abstract keyword, and then change method name of class Sub1 to calculate1(double x)
and call sub1.calculate(double x)
result => nothing(as super class body is empty) and no overrirde as method name is changed

*/
