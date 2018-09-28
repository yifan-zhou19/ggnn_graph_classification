package <missing>;

public class GlobalMembers
{
	public static double f(int n)
	{
		if (n == 0 || n == 1)
		{
		return 1;
		}
		else
		{
		return (f(n - 1) + f(n - 2));
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int w;
		int i;
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (w = 0;w < m;w++)
		{
			c = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 1;i <= n;i++)
			{
				d = f(i + 1) / f(i);
				c = c + d;
			}
			System.out.printf("%.3lf\n",c);
		}
		return 0;
	}
}

