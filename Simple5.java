abstract class XY
{
	abstract int get();
}
class Simple5 extends XY
{
	public int get()
	{
		return 5;
	}
	public static void main(String [] args)
	{
	Simple5 s5 = new Simple5();
	
	System.out.println(" "+s5.get());
	
	

	}
}


	