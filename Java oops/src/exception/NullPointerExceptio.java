package exception;

public class NullPointerExceptio {

	public static void main(String[] args) {
		
		String s =null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception handled");
		}
	}

}
