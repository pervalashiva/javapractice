package utils;

public class loopsPractice {

	  public static void main(String[] args) {
	        int i = 5;

	        System.out.println("Using while loop:");
	        while (i <= 5) {
	            System.out.println("Hello from while");
	            i++;  // This stops the loop
	        }

	        System.out.println("Using do-while loop:");
	        do {
	            System.out.println("Hello from do-while");
	        } while (i < 5);  // i is now 6, so this will NOT loop
	    }
}
