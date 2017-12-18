import java.io.*;

public class fileWriter {
	public static void main(String[] args) {
		try {
			File jeff = new File("src/jeff.csv");
			PrintWriter pw = new PrintWriter(jeff);
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i <= 10; i++) {
				for(int j = 1; j <= 10; j++) {
					sb.append(i*j + ",");
				}
				sb.append("\n");
			}
			pw.write(sb.toString());
			pw.close();
		}catch(FileNotFoundException no) {
			no.printStackTrace();
		}
	}
}




