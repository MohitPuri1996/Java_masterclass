class Simple
{
	int x;
	int getx()
	{
	return x;
	}
	int getx(int y)
	{
	x=y;
	return x;
	}
	int getx(int y,int z)
	{
	x=y+z;
	return x;
	}
}

public static void main(String [] args)
	{
	Simple a1 = new Simple();
	a1.x=5;	
	System.out.println(" First Method = "+a1.getx());
	System.out.println(" Second Method = "+a1.getx(3));
	System.out.println(" Third Method = "+a1.getx(3,5));
	
	}
}