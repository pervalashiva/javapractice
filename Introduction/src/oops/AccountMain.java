package oops;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.setAccno(101);
		acc.setAmount(424);
		acc.setName("shiva");
		
		System.out.print(acc.getAccno());
		System.out.print(acc.getName());
		
	}
	

}
