package Interface;

interface Shape
{
	int length = 10;
	int width  =120;
	void circle(); /// abstract method
	default void square()
	{
		System.out.print("qq");
	}
	static void rectangle()
	{
		System.out.print("qq");
	}
}


public class interFacedemo implements Shape {
	
	 public void circle()
	{
		System.out.print("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scenario-1
//		interFacedemo idobj = new interFacedemo();
//		
//		idobj.circle();
//		idobj.square();
//		
//		Shape.rectangle(); // static method can directly access from interfce
//		
		//Scenario - 2
		
		Shape sh = new interFacedemo();
		sh.circle();
		sh.square();
		
		Shape.rectangle(); //static method can directly access from interface
		
		
	}

}
