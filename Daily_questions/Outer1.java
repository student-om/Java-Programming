class Outer1{
int x = 10;
	private class Inner1{
	int x = 20;

	void display1(){
	System.out.println(Outer1.this.x);
	System.out.println(this.x);
	}
	}
	
	public static void main(String args[]){
	Outer1 o = new Outer1();
	Inner1 i = o.new Inner1();
	i.display1();
	//o.display1();  error
	}
}
