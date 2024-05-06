 class College{
				
				String name;
				int number;
				
				College(String name){
							this.name = name;
				}
				College(int number){
							this.number = number;
				}
				
				College(){
							
				}
				
	class Department{
						
						int number;
						String name;
				Department(){
							
				}		
			
				Department(int x){
								College.this.number = x;
								this.number = x;
							//this.number = x;
							//number = x;
				}
				
					Department(String x){
							this.name = x;
							//number = x;
				}
	}
	
			public static void main(String [] args){
						College col = new College("Hello WRLD");
						College colt = new College();
						College coll = new College(52);
						Department dept = col.new Department(90);
						College.Department dep = col.new Department();
						College.Department deptt = col.new Department("JShell");
						System.out.println("number "+ dept.number + " " +" name " +col.name);
					
						System.out.println("number "+ col.number + " " +" name " +dept.name);
				}

}
