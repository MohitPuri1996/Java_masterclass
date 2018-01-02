class Simple2
	{
	int x;
	int getx()
		{
		return x;
		}
	}
class Simple3 extends Simple2
	{
	int y;
	int gety()
		{
		return y;
		}
	int getx()
		{
		return x;
		}

public static void main(String [] args)
	{
	Simple2 s2 = new Simple2();
	Simple3 s3 = new Simple3();

	s2.x=5;
	s3.x=7;
	s3.y=6;
	
	System.out.println(" s2 x ="+s2.getx());
	System.out.println(" s3 y = "+s3.gety());
	System.out.println(" s3 x = "+s3.getx());

		}
	}