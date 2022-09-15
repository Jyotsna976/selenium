package Basicoops;

public class MethodOverloading {
	
	public static void main(String[] args) {
		 sum(10, 20);
		 sum(50, 70);
		 sum(10.2, 5.6);
		 
	}
	public static void sum(int x, int y) {
		int result = x+y;
		System.out.println("Sum is "+ result);
	}
	public static void sum(double x, double y) {
		double result = x+y;
		System.out.println("Sum is "+ result);
		
	}
	

}
