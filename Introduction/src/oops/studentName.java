package oops;

public class studentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		stu1.grad = 'A';
		stu1.id = 7687;
		stu1.name = "Shiva";
		stu1.printData();
		
		// sending the data throw method
		stu1.printStudentData("Shivak", 3444, 'D');
		stu1.printData();
	}

}
