package <missing>;

public class GlobalMembers
{
	public static double f(int n)
	{
		double a = 1;
		double b = 2;
		double c;
		int i = 1;
		double d = 2.000;
		if (n == 1)
		{
			return d;
		}
		while (i < n)
		{
			c = a + b;
			a = b;
			b = c;
			d += c / a;
			i++;
		}
		return d;
	}
	public static int Main()
	{
		int m;
		int i;
		int[] sz = new int[100];
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",f(sz[i]));
		}
		return 0;
	}


}

