import java.io.FileWriter;
import java.io.IOException;


public class FileWriterClass{
 public static void main(String args[]){
  try(FileWriter writer = new FileWriter("example.txt")){
  writer.write("Hello, ");
  writer.write("World!");
  writer.write("\r\n");//new line
  writer.write("This is an example of FileWriter in java."); 
  }
  catch(IOException e){
  System.err.println("Error Writing To File: "+e.getMessage());
  }
 }
}
 

/*Note:This Code Will overwrite the file if it already exits. if you want to append to the file instead, you can use the FileWriter constructor that takes a boolean append parameter like this:
new FileWriter("example.txt",true)
*/
