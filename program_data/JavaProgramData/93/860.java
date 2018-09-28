package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int k;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x % 3;
		b = x % 5;
		c = x % 7;
		if (a == 0)
		{
			System.out.print("3");
			k = 1;
		}

		if (b == 0)
		{
			if (k == 1)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			k = 1;
		}

		if (c == 0)
		{
			if (k == 1)
			{
			System.out.print(" ");
			}
		 System.out.print("7");
				 k = 1;
		}
		if (k != 1)
		{
			System.out.print("n");
		}
				return 0;

	}

}

