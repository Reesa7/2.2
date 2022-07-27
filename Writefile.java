package practiceproject2;


//Import the FileWriter class
import java.io.FileWriter; 

//Import the IOException class for handling errors
import java.io.IOException; 

public class Writefile {
 public static void main(String[] args)
 {
     String data = "120,reesa,andhrapradesh";
     try {
     FileWriter output = new FileWriter("C:\\Users\\reesa\\vemu.txt");
     output.write(data);
     System.out.println("data is written succesfully");
     output.close();
}catch(IOException ex) {
	ex.getStackTrace();
}
}
}