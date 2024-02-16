import java.util.Random;

class Trail{

public static Random random = new Random();


	public static void main(String args[]){
	long startTime = System.currentTimeMillis();
         int size = 1000000;
         String[] string1 = calculateTime(size);
        for(int i=0;i<size;i++){
        System.out.println(string1[i]);
        }
        int timer = 1;
        while(timer<=5){
        int NonprimeCount = countnonPrime(string1);
        System.out.println("The total number of non-Prime numbers are:" + NonprimeCount);
        
        int primeCount = countPrime(string1);
        System.out.println("The total number of Prime numbers are:" + primeCount);
         long elapsedTime = System.currentTimeMillis() - startTime;
         System.out.println("The time taken is:" + elapsedTime+" Milliseconds");
         timer++;
         }
         
	}
	
	public static int countnonPrime(String[] number){
	int count=0;
	for(int i=0;i<number.length;i++){
        int a = Integer.parseInt(number[i]);
		if(isPrime(a)==true){
		count++;
		}
	}	
	return count;
        }
        
        public static int countPrime(String[] number){
	int pcount=0;
	for(int i=0;i<number.length;i++){
        int a = Integer.parseInt(number[i]);
		if(isPrime(a)==false){
		pcount++;
		}
	}	
	return pcount;
        }
        
       public static boolean isPrime(int s) {
    if (s < 2) {
        return false;
    }
    
    for (int i = 2; i <= Math.sqrt(s); i++) {
        if (s % i == 0) {
            return false;
        }
    }
    return true;
}
        	
       
	
	public static String[] calculateTime(int size){
	
	String[]  regNo = new String[size];
	
	
	for(int i=0;i<size;i++){
	regNo[i] = GenerateRandomNumber();
	} 
	
	return regNo;
	
	
	}
	
	public static  String GenerateRandomNumber(){
	StringBuilder registrationNumber = new StringBuilder();
		for(int i=0;i<=6;i++){
		registrationNumber.append(random.nextInt(10));
		}
        return registrationNumber.toString();
	
	}
	}
	
	
	
