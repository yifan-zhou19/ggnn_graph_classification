package <missing>;

public class GlobalMembers
{
	public static int fun(int y,int m,int d)
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		int c;
		c = 0;
		for (i = 0;i < m;i++)
		{
		   c = c + a[i];
		}
		c = c + d;
		if ((m > 2) && (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)))
		{
			c++;
		}
		return c;
	}

	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		for (i = 0;i < 100;i++)
		{
			if ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
			System.out.print(fun(a, b, c));
			System.out.print("\n");
			}
		}
		return 0;
	}


}

