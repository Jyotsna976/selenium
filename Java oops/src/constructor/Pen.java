package constructor;

public class Pen {
	
	String Name;
	int Price;
	String Color;
	
	public void Pen()
	{
		System.out.println("I am not a parameterised constructor");
	}
	
	public void Pen(String Name)
	{
		this.Name= Name;
	}
	public void Pen(String Name, int Price)
	{
		this.Name=Name;
		this.Price=Price;
	}
	public void Pen(String Name,int Price,String Color)
	{
		this.Name=Name;
		this.Price=Price;
		this.Color=Color;
	}
	public void displayPen()
	{
		System.out.println("Name of pen is: "+Name);
		System.out.println("price of pen is: "+Price);
		System.out.println("color of pen is: "+Color);
		System.out.println("======================");
	}

	

}
