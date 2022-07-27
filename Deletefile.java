package practiceproject2;

//Import the File class
import java.io.File; 

public class Deletefile {
 public static void main(String[] args)
 {
     File myfile =  new File("C:\\Users\\reesa\\vemu.txt");
     if( myfile.delete()) {
    	 System.out.println("file deleted succesfully" +myfile.getName());
     }
     else {
    	 System.out.println("failed to delete the file");
     }
 }
}
