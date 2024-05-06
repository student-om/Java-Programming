//when you use streams(input or output)(from classes like BufferedReader,FileReader,FileWriter,etc) its your responsibilty to close it 
//try-with-resource is a perfect example of closing files
//we use try-with-resources statementto ensure the writer(or a class)is closed after use,regardless of whwther an exception is thrown or not.

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;

//copying from one file and pasting into another file 

class TryWithResource{
 public static void main(String args[]){
 try(FileWriter writer = new FileWriter("example.txt",true);  
 //true=>content of that file will not get overwrite
 BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
 String line;
   while((line=reader.readLine())!=null){
   writer.write(line);
   writer.write("\r\n");//new line 
   }
 }  catch(IOException e){
    System.err.println("Error Writing To File: "+e.getMessage()); 
    }
 }
}
