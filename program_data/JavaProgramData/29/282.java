package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return f(n - 1) + f(n - 2);
		}
	}

	public static int Main()
	{
		int m;
		int i;
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			int a;
			int d;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (d = 0;d < a;d++)
			{
				s = s + ((double)f(d + 3)) / ((double)f(d + 2));
			}
			System.out.printf("%.3lf\n",s);
			s = 0;
		}
		return 0;
	}
}

