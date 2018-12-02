import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		
		/*System.out.println("Enter a number:");
		
		int value = scanner.nextInt();
		
		while(value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}*/
		//The above comment is a manual way of the do loop
		
		int value = 0; //This is to declare int value outside of the curly brackets
		do {
		
			System.out.println("Enter a number: ");
			value = scanner.nextInt();

		}
		while(value != 5);
		
		System.out.println("Got 5!");
	}

}
