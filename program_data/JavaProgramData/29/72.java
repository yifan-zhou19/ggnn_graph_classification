package <missing>;

public class GlobalMembers
{
	public static int fbnq(int n)
	{
		if (n == 0)
		{
			return 0;
		}

		if (n == 1)
		{
			return 1;
		}

		return fbnq(n - 1) + fbnq(n - 2);
	}
	public static void Main(String[] args)
	{
		int m;
		int i;
		int n;
		int j;
		double sum = 0;
		double[] sz = new double[10000];
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
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				sz[j] = 1.0 * fbnq(j + 3) / fbnq(j + 2);
				sum += sz[j];
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0;

		}
	}


}

