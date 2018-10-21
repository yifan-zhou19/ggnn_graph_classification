package <missing>;

public class GlobalMembers
{
	public static double f(int n)
	{
		if (n == 1)
		{
			return 2;
		}
		else
		{
			return 1 + 1 / f(n - 1);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			double s = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				s += f(j);
			}
			System.out.printf("%.3lf\n",s);
		}
		return 0;
	}
}

