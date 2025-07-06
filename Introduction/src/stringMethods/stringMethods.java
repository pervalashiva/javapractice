package stringMethods;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sis = "Hell Shiva";
		
		System.out.println(sis.trim()); 
		
		String st = "Hello";
		char ch = st.charAt(1);
		System.out.println("Character at index 1: " + ch); 
	
		
		String str1 = "Hello, World!";
		String subStr = str1.substring(7, 12);
		System.out.println("Substring: " + subStr); 
		
		String str2 = "Hello, World!";
		int index = str2.indexOf("World");
		System.out.println("Index of 'World': " + index);
	
		String str3 = "Hello, World! World!";
		int index2 = str3.lastIndexOf("World");
		System.out.println("Last index of 'World': " + index2); 
	}

}
