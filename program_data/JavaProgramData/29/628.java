package <missing>;

public class GlobalMembers
{
	public static double f(double x)
	{
		if (x == 1)
		{
			return 1;
		}
		if (x == 2)
		{
			return 2;
		}
		if (x > 2)
		{
			return f(x - 1) + f(x - 2);
		}
	}
	public static double g(double y)
	{
		if (y == 1)
		{
			return 2;
		}
		if (y == 2)
		{
			return 3;
		}
		if (y > 2)
		{
			return g(y - 1) + g(y - 2);
		}
	}
	public static int Main()
	{
		int i;
		double s;
		double j;
		double n;
		double[] a = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			s = 0;
			for (j = 1;j <= a[i];j++)
			{

				s += g(j) / f(j);
			}
			System.out.printf("%.3lf\n",s);
		}
		return 0;
	}
}

