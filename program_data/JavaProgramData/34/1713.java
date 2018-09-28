package <missing>;

public class GlobalMembers
{
	public static void jiao(double x)
	{
		if (x == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		}
		  if ((int)x % 2 == 1)
		  {
			  x = ji(x);
			  jiao(x);
			  return;
		  }
		  if ((int)x % 2 == 0)
		  {
			  x = ou(x);
			  jiao(x);
			  return;
		  }
	}
	public static double ji(double x)
	{
		  System.out.print(x);
		  System.out.print("*");
		  System.out.print(3);
		  System.out.print("+");
		  System.out.print(1);
		  System.out.print("=");
		  System.out.print(3 * x + 1);
		  System.out.print("\n");
		  return 3 * x + 1;
	}
	public static double ou(double x)
	{
		  System.out.print(x);
		  System.out.print("/");
		  System.out.print(2);
		  System.out.print("=");
		  System.out.print(x / 2);
		  System.out.print("\n");
		  return x / 2;
	}
	public static int Main()
	{
		double n;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		jiao(n);

		return 0;
	}

}

