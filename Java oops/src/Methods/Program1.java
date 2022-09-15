package Methods;

public class Program1
{
	public static void test()
	{
		System.out.println("Test method begind");
		System.out.println("Inside test method");
		System.out.println("Test method ends");
		demo();
	}
	public static void main(String[] args) {
		System.out.println("main method begins");
		System.out.println("Inside main method");
		test();
		System.out.println("main method terminates");
	}
	public static void demo()
	{
		System.out.println("Inside demo method");
	}
	

}
