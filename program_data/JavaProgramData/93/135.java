package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int d;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		if (d % 3 == 0)
		{
		System.out.print("3");
		m++;
		}
	if (d % 5 == 0)
	{
		if (m == 1)
		{
			System.out.print(" ");
		}
		System.out.print("5");
		m++;
	}
	if (d % 7 == 0)
	{
		if (m != 0)
		{
			System.out.print(" ");
		}
		System.out.print("7");
		m++;
	}
	if (m == 0)
	{
	  System.out.print("n");
	}
	}
}

