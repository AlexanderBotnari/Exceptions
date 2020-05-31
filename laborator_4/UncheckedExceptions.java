import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions {

	public static void main(String[] args) {
	//Aici codul nu cere obligatoriu sa corectam codul in caz de exceptie 
		//UncheckedException
		Scanner in = new Scanner(System.in);
		System.out.println(" Your year of birth : ");
		
		try {
			int year = in.nextInt();
		    int age = 2020 - year;
		    System.out.println(" Your age is : "+age);
		}catch(InputMismatchException e) {
			//exceptie in cazul in care introducem litere 
			System.out.println("Wrong input format!");
		}catch(NullPointerException e) {
			//exceptie de tip null
			System.out.println("Something wrong!");
		}finally {
			//chiar daca programul se inchide sau are eroare afisam mesaj
			System.out.println("Thank you for using our app !");
		}
		     
	}

}
