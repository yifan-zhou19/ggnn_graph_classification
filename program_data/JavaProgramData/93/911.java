package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 3;
		b = n % 5;
		c = n % 7;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.print("3 5 7\n");
				}
			}
		}
		if (a == 0)
		{
			if (b == 0)
			{
				if (c != 0)
				{
					System.out.print("3 5\n");
				}
			}
		}
		if (a == 0)
		{
			if (b != 0)
			{
				if (c == 0)
				{
					System.out.print("3 7\n");
				}
			}
		}
		if (a != 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.print("5 7\n");
				}
			}
		}
		if (a == 0)
		{
			if (b != 0)
			{
				if (c != 0)
				{
					System.out.print("3\n");
				}
			}
		}
		if (a != 0)
		{
			if (b == 0)
			{
				if (c != 0)
				{
					System.out.print("5\n");
				}
			}
		}
		if (a != 0)
		{
			if (b != 0)
			{
				if (c == 0)
				{
					System.out.print("7\n");
				}
			}
		}
		if (a != 0)
		{
			if (b != 0)
			{
				if (c != 0)
				{
					System.out.print("n\n");
				}
			}
		}

		return 0;
	}
}

