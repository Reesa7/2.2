package practiceproject2;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; 

public class Readfile {
 public static void main(String[] args)
 {
     char[] data =   new char[100];
     try {
     FileReader input = new FileReader("C:\\Users\\reesa\\vemu.txt");
     input.read(data);
     System.out.println("data from a file :"+data);
     input.close();
     }catch(IOException ex) {
    	 ex.getStackTrace();
     }
}
}