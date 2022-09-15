package Basicoops;

public class MainOverloading {

	public static void main(String[] args) {
		
		System.out.println("main method with STring[] args parameter");
		main(12.6);
		main(12, 43);
	}
	public static void main(int a)
	{
		System.out.println(" main method with int parameter");
	}
	public static void main(double a)
	{
		System.out.println("decimal parameter main method");
	}
	public static void main(int a, int b)
	{
		System.out.println("main with int, int parameter");
	}

	}


