package Methods;

public class Recurssion {
	public static void main(String[] args) {
		System.out.println("This is main method");
	
	    System.out.println("Main method ends");
	}
	public static void test()
	{
		System.out.println("This is test method");
		test();
	}
}
