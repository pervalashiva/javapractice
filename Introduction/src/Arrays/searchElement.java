package Arrays;

public class searchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10, 20, 30, 40, 50};
		int search = 80;
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] == search)
			{
				System.out.println(search);
				break;
			}
			
		}
		System.out.println("no such element");
	}

}
