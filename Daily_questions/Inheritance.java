class Super{
	private int a;
	protected static int b;
	void display(){
	System.out.println(a);
	}
}

	class Sub extends Super{
		public void get(){
		//System.out.println(a);  this will give error
		System.out.println(b);
	}
}

class Inheritance{
	public static void main(String args[]){
	//System.out.println("Super.b =(Super is a Parent class)" + Super.b);  will print 0 as b is static,can be accesed by class_name.b
	Sub s = new Sub();
	s.get();
	Super sup = new Super();
	sup.display();
	//System.out.println(sup.a); will give error
	
	}
}
