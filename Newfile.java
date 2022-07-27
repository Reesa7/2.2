package practiceproject2;
import java.io.File;

class Newfile {
public static void main(String[] args) {
 File myfile = new File("C:\\Users\\reesa\\vemu.txt");
 try {
   boolean value = myfile.createNewFile();
		   if (value) {
     System.out.println("The new file is created.");
   }
   else {
     System.out.println("The file already exists.");
   }
 }
 catch(Exception e) {
   e.getStackTrace();
 }
}
}
