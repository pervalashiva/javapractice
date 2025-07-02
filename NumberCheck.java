package utils;
import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.print("Enter a nuumber");
		int number = scanner.nextInt();
		if (number > 0) {
			System.out.println("The number is positive");
		} else if ( number < 0) {
			System.out.println("The number is negative");
		}
		
		scanner.close();
	}
	

}
