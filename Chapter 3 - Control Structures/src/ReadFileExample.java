import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileExample {
	public static void main(String[] args)
	{
		try {
            File inFile = new File("src/example.txt");
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                inLine = br.readLine(); // Takes the next line of the text file.
                System.out.println(inLine);
                // Fill in code within this while loop to make program run.
            	// You will need to change line 9 to "File inFile = new File("src/example.txt");" BUT DO NOT FORGET TO CHANGE IT BACK.
            	// Good luck :)
            }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}