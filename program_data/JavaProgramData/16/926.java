package <missing>;

public class GlobalMembers
{
	public static void fun()
	{
		char c;
		if ((c = System.in.read()) != '\n')
		{
		   fun();
		}
		System.out.print(c);

	}

	public static int Main()
	{
	   fun();
	   System.in.read();
	}


}
