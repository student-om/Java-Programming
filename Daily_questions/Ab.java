abstract class Ab{
int x;
	abstract void Engine();
	abstract void CarName();
}

class SUV extends Ab{
int x = 10;//for all objexts of SUV class x = 10
	public void Engine(){
	System.out.println("SUVEngine");
	}
	
	public void CarName(){
	System.out.println("SUV");
	}	
}

class Sports extends Ab{
	public void Engine(){
	System.out.println("SportsEngine");
	}
	
	public void CarName(){
	System.out.println("Sports car");
	}	
}

class Car{
	public static void main(String args[]){
	SUV sumo = new SUV();
	sumo.Engine();
	sumo.CarName();
	sumo.x = 10;
	SUV Brezza = new SUV();
	System.out.println(Brezza.x);  //intersting
	Ab Devilliars = Brezza;  //referance to abstract class(advantage is extra variable or method that wrtten in subclass that is not a part of abstract class it do not access it) it only accesses what is written in abstract class
	System.out.println(Devilliars.x);   //interesting
	}
}
