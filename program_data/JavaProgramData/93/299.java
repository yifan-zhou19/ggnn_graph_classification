package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 3;
		c = a % 5;
		d = a % 7;
		if (b == 0)
		{
			if (c == 0)
			{
				if (d == 0)
				{
					System.out.print("3 5 7");
				}
				else
				{
					System.out.print("3 5");
				}
			}
			else
			{
				if (d == 0)
				{
					System.out.print("3 7");
				}
				else
				{
					System.out.print("3");
				}
			}
		}
		else
		{
			if (c == 0)
			{
				if (d == 0)
				{
					System.out.print("5 7");
				}
				else
				{
					System.out.print("5");
				}
			}
			else
			{
				if (d == 0)
				{
					System.out.print("7");
				}
				else
				{
					System.out.print("n");
				}
			}
		}
		return 0;
	}
}

