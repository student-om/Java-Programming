import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistrationGenerator {
    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final Random random = new Random();

    private static String generateRegistrationNumber() {
        StringBuilder registrationNumber = new StringBuilder();

        // Generate 4 random numbers
        for (int i = 0; i < 4; i++) {
            registrationNumber.append(random.nextInt(10));
        }

        // Generate 3 random letters
        for (int i = 0; i < 3; i++) {
            registrationNumber.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        }

        // Generate another 3 random numbers
        for (int i = 0; i < 3; i++) {
            registrationNumber.append(random.nextInt(10));
        }

        return registrationNumber.toString();
    }

    private static String[] generateAndMeasureTime(int arraySize) {
  

        String[] registrationNumbers = new String[arraySize];
       
        


        // Generate registration numbers and store in the array

        for (int i = 0; i < arraySize; i++) {

            registrationNumbers[i] = generateRegistrationNumber();

        }


        
        // Your operations using registrationNumbers go here

       


        return registrationNumbers ;

    }

    public static void main(String[] args) {
        int arraySize = 10000;

            String[] a1 = RegistrationGenerator.generateAndMeasureTime(arraySize);
            
           
            
           
           
            int i=0;
            long count1;
            int noOfIterations = 13;
            long[] timeTaken = new long[noOfIterations];
            while(i<noOfIterations){
            long startTime = System.nanoTime();
            count1 = ap1(a1);
           long  endTime = System.nanoTime();
            timeTaken[i]=endTime - startTime;
            i++;
            }
            double averageTime = RegistrationGenerator.average(timeTaken);
            System.out.println("the average time required for approach1 is : " + averageTime + " nanoSeconds");            
            i=0;
            long count2;
            while(i<noOfIterations){
            long startTime = System.nanoTime();
            count2 = ap2(a1);
           long  endTime = System.nanoTime();
            timeTaken[i]=endTime - startTime;
            i++;
            }
            double averageTime1 = RegistrationGenerator.average(timeTaken);
            System.out.println("the average time required for approach2 is : " + averageTime1 + " nanoSeconds");            
            
            i=0;
            long count3;
            while(i<noOfIterations){
            long startTime = System.nanoTime();
            count3 = ap3(a1);
           long  endTime = System.nanoTime();
            timeTaken[i]=endTime - startTime;
            i++;
            }
            
            double averageTime2 = RegistrationGenerator.average(timeTaken);
            System.out.println("the average time required for approach3 is : " + averageTime2 + " nanoSeconds");            
            
            
        
    }
    
    public static double average(long[] b){
    double a =0;
    	for(int i=0;i<b.length;i++){
    	a+=b[i];
    	}
    	return (a/b.length);
    	
    }
    
    public static boolean checkByComparing(Integer a2){
        if(a2.compareTo(051)==-1 && a2.compareTo(000)==1 ){
        return true;
        }
      
        return false;
        }
    
    
    public static long ap1(String[] registrationNumbers){
    long count=0;
      for(int i=0;i<registrationNumbers.length;i++){
      
       String a1 = registrationNumbers[i].substring(2,3);
        int number = Integer.parseInt(a1);
        	if(number >=1 && number <=50){
        	count++;
        	}
  
       
        }
        return count;	
        }
        
        public static long ap2(String[] registrationNumbers){
        long count =0;
         for(int i=0;i<registrationNumbers.length;i++){
        Character f1 = registrationNumbers[i].charAt(7);
       Character f2 = registrationNumbers[i].charAt(8);
       Character f3 = registrationNumbers[i].charAt(9);
        	if(Character.isDigit(f1) & Character.isDigit(f1) & Character.isDigit(f1)){
        		if((f1=='0' & f2>='0' & f2<='4')==true){
        		count++;
        		}
        	       else if((f1=='0' & f2=='5' & f3=='0')){
        		count++;
        		}
        		else{
        		continue;
        		}
        		}
        		
        		}
        		return count;
        		}
        		
        public static long ap3(String[] registrationNumbers){
        long count=0;
        		
        		for(int i=0;i<registrationNumbers.length;i++){
        String a1 = registrationNumbers[i].substring(7,9);
        Integer number = Integer.parseInt(a1);
        	if(checkByComparing(number)==true){
        	count++;

        	
        }	
       
       }
       return count;
       }
}
