import java.io.*;

public class FileReaderEg {
	
	public static void main(String []args) {
		try {
			BufferedReader br = new BufferedReader(new 
					FileReader("output.txt"));
			
			String str;
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
		}catch (Exception ex) {
			return;
		}
	}
}
