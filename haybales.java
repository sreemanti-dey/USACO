import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//USACO 2011 December problem 1
public class haybales {
	public static void main(String[] args) {
		String inputPath = "C:/Users/Sreem/OneDrive/Documents/School/Programming/USACO_haybales/I.2";
		String outputPath = "C:/Users/Sreem/OneDrive/Documents/School/Programming/USACO_haybales/OUTPUT2.OUT";
		int ans = 0;
		try {
			Scanner input = new Scanner(new File(inputPath));
			int numBales = input.nextInt();
			int[] bales = new int[numBales];
			int avg = 0;
			for (int i = 0; i <= numBales - 1; i++) {
				bales[i] = input.nextInt();
				avg += bales[i];
			}
			input.close();
			avg /= numBales;
			for (int j = 0; j <= numBales - 1; j++) {
				int temp = (int) (Math.abs(bales[j] - avg));
				ans += temp;
			}
			ans /= 2;
			FileWriter output = new FileWriter(outputPath);
			output.write(String.valueOf(ans));
			output.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
