package oops;

public class Adder {

	int a =10, b = 20;
	
	void sum()
	{
		System.out.print(a+b);
	}
	void sum(int x, int y)
	{
		System.out.print(x+y);
	}
	void sum(int x, double y)
	{
		System.out.print(x+y);
	}
	void sum(double x, int y)
	{
		System.out.print(x+y);
	}
	void sum(int a, int b, int c)
	{
		System.out.print(a+b+c);
	}
	
}
