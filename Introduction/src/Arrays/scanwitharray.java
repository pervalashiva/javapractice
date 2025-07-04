package Arrays;

import java.util.Scanner;

public class scanwitharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i= 0; i<a.length; i++)
		{
			System.out.print("Enetr a value for the position");
			a[i] = sc.nextInt();
			
		}
		System.out.print("print array elements");
	}

}
