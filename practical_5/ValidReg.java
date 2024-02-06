class SY2022bit046{

	public static void main(String[] args){
        String[] registrations1 = {"2c22BCS0460","2021btt012","2022bit046","2025BME002"};
        SY2022bit046 k = new SY2022bit046();
        int y = k.getValidRegistrationsCount(registrations1);
        System.out.println(y);
        }        
        
        
	public int getValidRegistrationsCount(String[] registrations){    //function that will return the count of valid reg no's
	String u1 = "bit";
	String u2 = "bcs";
	String u3 = "bch";
	String u4 = "bme";
	String u5 = "BIT";
	String u6 = "BCS";
	String u7 = "BCH";
	String u8 = "BME";
	
	int count = 0;
	for(int i=0;i<registrations.length;i++){
	Character k = '0';                 //initialized k to use Character class Function isDigit
	Character g1 = registrations[i].charAt(0);
	Character g2 = registrations[i].charAt(1);
	Character g3 = registrations[i].charAt(2);
        Character g4 = registrations[i].charAt(3);
        if(registrations[i].length()==10){  // checking if there are 10 characters in the registrationsay
		if(k.isDigit(g1) & k.isDigit(g2) & k.isDigit(g3) & k.isDigit(g4) & g1=='2' & g2=='0' & g3>='0' & g3<='2' & g4>='0' & g4<='4' == true ){  //checking if first 4 digits are integers and between 2000 and 2024
			if((registrations[i].regionMatches(4,u1,0,3) || registrations[i].regionMatches(4,u2,0,3) || registrations[i].regionMatches(4,u3,0,3) || registrations[i].regionMatches(4,u4,0,3) || 	registrations[i].regionMatches(4,u5,0,3) || registrations[i].regionMatches(4,u6,0,3) || registrations[i].regionMatches(4,u7,0,3) || registrations[i].regionMatches(4,u8,0,3))==true){  //checking if next 3 values are valid
				if((registrations[i].charAt(7) & registrations[i].charAt(8) & registrations[i].charAt(9))>=48 && (registrations[i].charAt(7) & registrations[i].charAt(8) & registrations[i].charAt(9))<=57){ //checking if last 3 values are valid
				count++;
				}
			}
		}		
	}
	}
	return count;
	} 
}
