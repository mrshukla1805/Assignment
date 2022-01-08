
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class CopyFileEg {
	public static void main(String []args) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("output-copy.txt"));
			BufferedReader br = new BufferedReader(new 
					FileReader("output.txt"));
			
			String str;
			while((str = br.readLine())!=null) {
				bw.write(str+"\n");;
			}
			br.close();
			bw.close();
		}catch (Exception ex) {
			return;
		}
	}
}
