package Arrays;

import java.util.Scanner;

public class multipleinputsscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner ab = new Scanner(System.in)) {
			System.out.print("Enter first number");
			int num1 = ab.nextInt();

			System.out.print("Enter 2nd number");
			int num2 = ab.nextInt();
			
			System.out.print("add: " +( num1+num2));
		}
		
		
		
	}

}
