package Methods;

public class Parameterisedmethod1 {
	public static void sum(int a, int b, int c)
	{
		int result = a+b+c;
		System.out.println("sum of number is :" +result);
	}
	public static void main(String[] args) {
		sum(12,13,15);
		sum(50,20,90);
	}

}
