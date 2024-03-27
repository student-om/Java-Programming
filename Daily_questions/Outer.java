class Outer{
	String name="outer";
	int bal=0;
	void display(){
	System.out.println(name);
	}
	
		private class Inner{
	String name="inner";
	int rate = 789;
	void display1(){
	System.out.println("outer class name=" + Outer.this.name+" ineer class name= " + this.name);
	//look at bal, it is accesed directly by inner class;
	System.out.println("outer class bal= " + bal + " rate=" + rate);
	//or
	System.out.println("outer class bal= " + Outer.this.bal + " rate=" + this.rate);
	}
		}
	
	public static void main(String args[]){
	Outer outer = new Outer();
	Inner inner = outer.new Inner();
	outer.display();
	inner.display1();
	}
	
	
}
