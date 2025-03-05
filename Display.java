import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Display {

	public static void main(String args[]) throws IOException {
		
		Scanner file = new Scanner(new File("C:\\Users\\realg\\Desktop\\aloo.txt"));
		
		//System.out.println(file.getCanonicalPath());
		
		String ardp = file.nextLine();
		//System.out.println(file.nextLine());
		System.out.println(ardp);
		
		file.close();
	}
	
}
