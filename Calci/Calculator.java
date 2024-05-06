//Day 5.
import java.lang.Math;
 class Calculator{

	public static long addition(long a , long b){
        return a+b;
	}
	
	public static long subtraction(long a , long b){
        return a-b;
	}
	
	public static long multiplication(long a , long b){
        return a*b;
	}
	
	public static long square(long a){
        return a*a;
	}
	
	public static long cube(long a){
        return a*a*a;
	}
	
	public static double division(long a , long b){
	try{
        	if(b!=0){
        	return a/b;
        	}
        	else{
        	throw new DivideByZeroException("Number Cannot be Divide by Zero");
        	}
        	}
        	
        //catch blocks 
	catch(DivideByZeroException err){
	System.out.println(err);
	}
	return 0;
	}
	
	public static long power(long base , long exponential){
        long result = 1;
        	for(int i=0;i<exponential;i++){
                result*=base;
        	}
        return result;
	}
	
	public static long remainder(long a , long b){
        return a%b;
	}
	
	
	
	public static double exponentialPower(long power){
        double result = 1;
        	for(int i=0;i<power;i++){
                result*=2.71828;
        	}
        return result;
	}
	
	
	public static double absolute(long number){
        return Math.abs(number);
	}
	
	
	
	
	public static long[][] matrixMultiplication(int[][] a, int[][] b) {
	
    	int rowsA = a.length;
    	int colsA = a[0].length;
    	int rowsB = b.length;
    	int colsB = b[0].length;
    	long[][] result = new long[rowsA][colsB];
	try{
    	if (colsA != rowsB) {
        throw new MatrixMatchException("Matrix dimensions do not allow multiplication.");
    	}
    	
	
    	

    	for (int i = 0; i < rowsA; i++) {
     	   for (int j = 0; j < colsB; j++) {
     	       for (int k = 0; k < colsA; k++) {
       	         result[i][j] += a[i][k] * b[k][j];
         	   }
        	}
 	   }
 	} 
 	 
 	catch(MatrixMatchException e){
 	System.out.println(e);
 	}

    	return result;
	}
	

public static long[][] matrixAddition(int[][] a, int[][] b) {
    int rowsA = a.length;
    int colsA = a[0].length;
    int rowsB = b.length;
    int colsB = b[0].length;
    long[][] result = new long[rowsA][colsB];
    try{
    if((colsA==colsB)&&(rowsA==rowsB)){ 	
    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
            result[i][j] = a[i][j] + b[i][j];
        }
    }
    }
    else{
       throw new MatrixMatchException("Matrix dimensions do not allow addition.");
    }
    }
    
    catch(MatrixMatchException e){
    System.out.println(e);
    }

    return result;
}

	public static long[][] matrixSubtraction(int[][] a, int[][] b) {
	 int rowsA = a.length;
         int colsA = a[0].length;
         int rowsB = b.length;
         int colsB = b[0].length;
         long[][] result = new long[rowsA][colsB];
    try{
    if((colsA==colsB)&&(rowsA==rowsB)){

    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
            result[i][j] = a[i][j] - b[i][j];
        }
    }
    }
    else{
       throw new MatrixMatchException("Matrix dimensions do not allow Subtraction.");
    }
    }
    
    catch(MatrixMatchException e){
    System.out.println(e);
    }
    
    
    return result;
}
	
		
	
	
	public static double reciprocal(long a){
	try{
	if(a!=0){
	return 1/a;
	}
	else{
	throw new DivideByZeroException("Cannot Divide By Zero");
	}
	}
	
	catch(DivideByZeroException e){
	System.out.println(e);
	}
	return 0.0;
	}
	
	
	public long factorial(long n){
	try{
	if(n==1){
	return 1;
	}
	else if(n<0){
	throw new NegativeNumberException("Number cannot  be Negative");
	}
	else{
	return n*factorial(n-1);
	}
	}
	
	catch(NegativeNumberException e){
	System.out.println(e);
	}
	return 0;
	}
	
	public long permutations(long n,long r){
	long a1 = factorial(n);
	long a2 = factorial(n-r);
	return a1/a2;
	}
	
	public long combinations(long n,long r){
	long a1 = factorial(n);
	long a2 = factorial(n-r);
	long a3 = factorial(r);
	return a1/(a3*a2);
	}
	
	public static String decimalToRadix(int number,int radix){
	String a;
	a = Long.toString(number,radix);
	return a;
	}
	
	public static double calculateLog(double base,double number){
	return Math.log(number)/Math.log(base);
	}
	
	public static double sine(double a){
	double b = Math.toRadians(a);
	return Math.sin(b);
	}
	
	public static double cosine(double a){
	double b = Math.toRadians(a);
	return Math.cos(b);
	}
	
	
	public static double tangent(double a){
	double b = Math.toRadians(a);
	return Math.tan(b);
	}
	
	public static double Inversesine(double a){
	return	Math.toDegrees(Math.asin(a));
	}
	
	public static double Inversecosine(double a){
	return	Math.toDegrees(Math.acos(a));
	}
	
	public static double Inversetangent(double a){
	return	Math.toDegrees(Math.atan(a));
	}
	
	public static double TenToPowerX(double exp){
	return Math.pow(10,exp);
	}
	
	public static double sqRoot(double num){
	return Math.sqrt(num);
	}
	
	public static double cbRoot(double num){
	return Math.cbrt(num);
	}
	
	public static double pie(){
	return 3.141592654;
	}
	
	
}


class Complex{
	long real;
	long imaginary;
	Complex(long real,long imaginary){
	this.real = real;
	this.imaginary = imaginary;
	}
	
	public void display(Complex c){
	System.out.println(this.real+this.imaginary+"i");
	}
	
	
	public static Complex addComplex(Complex c1,Complex c2){
	Complex result = new Complex(0,0);
	result.real = c1.real + c2.real;
	result.imaginary = c1.imaginary + c2.imaginary;
	return result;
	}
	
	public static Complex subComplex(Complex c1,Complex c2){
	Complex result = new Complex(0,0);
	result.real = c1.real + c2.real;
	result.imaginary = c1.imaginary - c2.imaginary;
	return result;
	}
	
	public static Complex mulComplex(Complex c1,Complex c2){
	Complex result = new Complex(0,0);
	long term1 = c1.real * c2.real;
	long term2 = c1.real * c2.imaginary;
	long term3 = c1.imaginary * c2.real;
	long term4 = c1.imaginary * c2.imaginary;
	result.real = term1+term4;
	result.imaginary = term2-term4;
	return result;
	}
	
	public static Complex conjugate(Complex c1){
	c1.imaginary = -c1.imaginary;
	return c1;
	}
	
	
	
}


// Exceptions classes(user-defined)

class DivideByZeroException extends Exception{
	DivideByZeroException(String err){
	super(err);
	}
}

class MatrixMatchException extends Exception{
	MatrixMatchException(String err){
	super(err);
	}
}

class NegativeNumberException extends Exception{
	NegativeNumberException(String err){
	super(err);
	}
}


