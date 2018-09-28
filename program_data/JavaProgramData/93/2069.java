package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int u;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			u = Integer.parseInt(tempVar);
		}
		a = u % 3;
		b = u % 5;
		c = u % 7;

		if (a > 0)
		{
			if (b > 0)
			{
				if (c > 0)
				{
					System.out.print("n");
				}
				else
				{
					System.out.print("7");
				}
			}
			else
			{
				if (c > 0)
				{
					System.out.print("5");
				}
				else
				{
					System.out.print("5 7");
				}
			}
		}
		else
		{
			if (b > 0)
			{
				if (c > 0)
				{
					System.out.print("3");
				}
				else
				{
					System.out.print("3 7");
				}
			}
			else
			{
				if (c > 0)
				{
					System.out.print("3 5");
				}
				else
				{
					System.out.print("3 5 7");
				}
			}
		}

	}
}

