// Java Program to Illustrate BufferedReader Class 
// Via Its Methods 

// Importing required classes 
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 

//file.txt contains: This is first line
                   //This is second line

// Class 
class GFG { 

	// Main driver method 
	public static void main(String[] args) 
		throws IOException 
	{ 

		// Creating object of FileReader and BufferedReader 
		// class 
		FileReader fr = new FileReader("file.txt"); 
		BufferedReader br = new BufferedReader(fr); //FileReader can be input to BufferedReader

		char c[] = new char[20]; 

		// Illustrating markSupported() method 
		if (br.markSupported()) { 

			// Print statement 
			System.out.println( 
				"mark() method is supported"); 

			// Illustrating mark method 
			br.mark(100); //marked on beginning of the first line(from start of file)
		} 

		// File Contents is as follows: 
		// This is first line 
		// this is second line 

		// Skipping 8 characters 
		br.skip(8); 

		// Illustrating ready() method 
		if (br.ready()) { 

			// Illustrating readLine() method 
			System.out.println(br.readLine()); 

			// Illustrating read(char c[],int off,int len) 
			br.read(c); 

			for (int i = 0; i < 20; i++) { 
				System.out.print(c[i]); 
			} 

			System.out.println(); 

			// Illustrating reset() method 
			br.reset(); //Resets the stream to the most recent mark.
			for (int i = 0; i < 20; i++) { 

				// Illustrating read() method 
				System.out.print((char)br.read()); 
			} 
		} 
	} 
}

//output:mark() method is supported
//first line
//this is second line
//This is

