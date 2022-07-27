package practiceproject2;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		String data = "this data is appended";
		try {
		FileWriter output = new FileWriter("C:\\Users\\reesa\\vemu.txt",true);
		output.write(data);
		System.out.println("data appended succesfully");
		output.close();
		}catch(IOException ex ) {
			ex.getStackTrace();
		}
	}
}

