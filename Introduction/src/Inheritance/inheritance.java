package Inheritance;

public class inheritance {

class A {
	
	int a =100;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b = 200;
			void show()
			{
				System.out.println(b);
			}
}

class c extends B
{
	int c = 300;
	void print()
	{
		System.out.println(c);
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		B bobj = new B();
//		System.out.println(bobj.a);
//		System.out.println(bobj.b);
//		
//		bobj.display();
//		bobj.show();
//		
//		C cobj = new c();
//		
//		cobj.a = 100;
//		cobj.b=200;
//		cobj.c=300;
//		
//		cobj.display();
//		cobj.show();
//		cobj.print();
		
	}

}
