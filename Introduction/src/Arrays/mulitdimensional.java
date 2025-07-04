package Arrays;

public class mulitdimensional {

	public static void main(String[] args) {
		
//		int a[][] = new int [3] [2];
//		a[0][1] = 100;
//		a[][]= 200;
//		a[][] = 300;
		
		//approach 2
		int a[][]= { {100,200}, {300, 400}, {500, 600}};
		//find size
		
//		System.out.print("length of rows" + a[0].length);
//		System.out.print(a[2][1]);
		
		for (int r = 0; r <=2; r++)
		{
			for(int c = 0; c <=1 ; c++) {
				
				System.out.print(a[r][c]);
			}
			System.out.println();
		}
		
	}
}
