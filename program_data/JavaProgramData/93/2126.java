package <missing>;

public class GlobalMembers
{
	/*?????????*/
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		a = 0;
		b = 0;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			a = 1;
		}
		if (n % 5 == 0)
		{
			b = 1;
		}
		if (n % 7 == 0)
		{
			c = 1;
		}
		if (a == 1)
		{
			if (b == 1)
			{
				if (c == 1)
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
				if (c == 1)
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
			if (b == 1)
			{
				if (c == 1)
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
				if (c == 1)
				{
					System.out.print("7");
				}
				else
				{
					System.out.print("n");
				}
			}
		}
	}



}

