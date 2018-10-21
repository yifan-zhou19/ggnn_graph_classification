package <missing>;

public class GlobalMembers
{
	public static double fnt(int n)
	{
		double m;
		double a = 2;
		double b = 1;
		if (n == 0)
		{
			m = 1;
		}
		if (n == 1)
		{
			m = 2;
		}
		if (n > 1)
		{
			for (int i = 1;i < n;i++)
			{
				m = a + b;
				b = a;
				a = m;
			}
		}
		return m;
	}
	public static int Main()
	{
		int z;
		int j;
		int k;
		int l;
		double[] sz = new double[50];
		double sum = 0;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Integer.parseInt(tempVar);
		}
		for (j = 0;j < z;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (l = 0;l < k;l++)
			{
				s = fnt(l + 1) / fnt(l);
				sum = sum + s;
			}
			sz[j] = sum;
			sum = 0;
		}
		for (j = 0;j < z;j++)
		{
			System.out.printf("%.3lf\n",sz[j]);
		}
		return 0;
	}
}

