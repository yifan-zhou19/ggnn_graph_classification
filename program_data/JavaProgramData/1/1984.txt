package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int fj(int x, int y)
	{
		int xnumber = 1;
		int i;
		int b = Math.sqrt(x);
		if (x == 1)
		{
			return 0;
		}
		else
		{
			for (i = y; i <= b; i++)
			{
				if (x % i == 0)
				{
					xnumber = xnumber + fj(x / i, i);
				}
			}
		}
			return xnumber;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 1; i <= n; i++)
		{
		   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(fj(a, 2));
		   System.out.print("\n");
		}
		return 0;
	}
}

