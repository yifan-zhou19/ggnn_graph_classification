package <missing>;

public class GlobalMembers
{
	public static double F(double x)
	{
		double[] sz = new double[500];
		if (x == 1)
		{
			return 2.0;
		}
		if (x == 2)
		{
			return 3.0;
		}
		int b;
		for (b = 3;b <= x;b++)
		{
			sz[1] = 2.0;
			sz[2] = 3.0;
			sz[b] = sz[b - 1] + sz[b - 2];
		}
		return sz[(int)x];
	}
	public static double f(double y)
	{
		double[] zs = new double[500];
		if (y == 1)
		{
			return 1.0;
		}
		if (y == 2)
		{
			return 2.0;
		}
		int c;
		for (c = 3;c <= y;c++)
		{
			zs[1] = 1.0;
			zs[2] = 2.0;
			zs[c] = zs[c - 1] + zs[c - 2];
		}
		return zs[(int)y];
	}
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			double a = 0.0;
			double n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Double.parseDouble(tempVar2);
			}
			int k = 1;
			for (k = 1;k <= n;k++)
			{
				a = a + (F(k) / f(k));
			}
			System.out.printf("%.3lf\n",a);
		}
		return 0;
	}
}

