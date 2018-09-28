package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % 3 == 0)
		{
			a = 1;
		}
		if (x % 5 == 0)
		{
			b = 1;
		}
		if (x % 7 == 0)
		{
			c = 1;
		}
		if (a + b + c == 0)
		{
			System.out.print("n\n");
		}
		else
		{
			if (a + b == 0)
			{
				System.out.print("7\n");
			}
			if (b + c == 0)
			{
				System.out.print("3\n");
			}
			if (a + c == 0)
			{
				System.out.print("5\n");
			}
		}
		if (a * b * c == 1)
		{
			System.out.print("3 5 7\n");
		}
		else
		{
			if (a * b == 1)
			{
				System.out.print("3 5\n");
			}
			if (b * c == 1)
			{
				System.out.print("5 7\n");
			}
			if (a * c == 1)
			{
				System.out.print("3 7\n");
			}
		}
	}

}

