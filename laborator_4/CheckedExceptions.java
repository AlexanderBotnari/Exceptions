import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedExceptions {

	public static void main(String[] args) {
		
		int result = getDataFromFile();
		System.out.println(result);
	}
    public static int getDataFromFile() {
    	
		try {
			//citim datele dintrun fisier text
			Scanner in = new Scanner(new File("number.txt"));
			int data = in.nextInt();
			return data;
		} catch (FileNotFoundException e) {
			//generam aceasta exceptie in caz ca fisierul nu a fost gasit
			System.out.println("File not found!");
		}catch(InputMismatchException e) {
			//generam aceasta exceptie in caz ca formatul nu e corect
			System.out.println("Wrong data format!");
		}
    	return 0;
    }
}
