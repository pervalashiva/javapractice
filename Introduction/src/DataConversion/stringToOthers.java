package DataConversion;


public class stringToOthers {
	public static void main(String[] args) {
		
//		String s1 ="10";
//		String s2 = "20";
//		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
//	
//		

//		String s1 ="True";
//		//String s2 = "20";
//		System.out.println(Boolean.parseBoolean(s1));
//	
//		dataType into string format
		
		int a = 10;
		double b =10.9;
		char c = 'A';
		boolean bool = true;
		
		String s = String.valueOf(a);
				
		System.out.println(s);
		
		String k = String.valueOf(b);
		
		System.out.println(k);
		
		String l = String.valueOf(c);
		
		System.out.println(l);
		
		String m = String.valueOf(bool);
		
		System.out.println(m);
		
	}

}
