class Area
{
	void area()
	{	
	System.out.println("Area = 0");
	}
}
	
class Square extends Area
{
	void area()
	{
	System.out.println("Area = "+(7*7));
	}
}

class Rectangle extends Area
{
	void area()
	{
	System.out.println("Area = "+(7*8));
	}
}

class Simple6
{
	public static void main(String [] args)
		{
		Area a = new Area();
		a.area();
		Square s = new Square();
		s.area();
		Rectangle r = new Rectangle();
		r.area();
		}
}		

