package Methods;
import java.util.*;

public class Program3 {
	public static void sum()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		System.out.println("Enter c");
		double c=sc.nextDouble();
		double result=a+b+c;
		System.out.println("Sum is :"+ result);
		test();
		System.out.println("sum method ends");
		
	}
	public static void main(String[] args) {
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
