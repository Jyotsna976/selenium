package Methods;

public class Program2 {
	public static void sum()
	{
		int a=12;
		int b=18;
		int c=20;
		int result=a+b+c;
		System.out.println("sum is:" + result);
		test();
		System.out.println("sum method ends");
		
	}
	public static void main(String[] args)
	{
		System.out.println("main method begins");
		sum();
		test();
		sum();
		System.out.println("main method ends");
	}
	public static void test()
	{
		System.out.println("This is test method");
	
	}

}
