package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		System.out.println(a/0);
		System.out.println(a/b);
		try
		{
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println();
		}
	}

}
