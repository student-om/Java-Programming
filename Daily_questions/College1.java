
//nested class

class College1{
String a;
	College1(String a){
        this.a = a;
	}
	
	public static void main(String args[]){
	College1 sggs1 = new College1("SGGS");
	System.out.println(" "+sggs1+" "+sggs1.a);
	Department dept = sggs1.new Department("IT");
        System.out.println(" "+dept.deptName);
	
	
	}
	
	class Department{
	String deptName;
	Department(String deptName){
	this.deptName = deptName;
	
	}
	}
}
