class ABC
{
	int x;
	int getx()
	{
	return x;
	}
public static void main(String [] args)
	{
	ABC a1 = new ABC();
	a1.x=5;
	System.out.println(" "+a1.getx());
	}
}