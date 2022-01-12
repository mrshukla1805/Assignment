
import java.io.*;

public class FileWriterEx {
	
	public static void main(String []args) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("output.txt"));
			bw.write("Parth\n");
			bw.write("Rishabh\n");
			bw.write("ISS\n");
			bw.close();
			
		}catch(Exception ex) {
			return;
		}
	}
}
