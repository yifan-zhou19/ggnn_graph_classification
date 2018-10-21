package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int result;
		if (a == 0)
		{
			return 1;
		}
		if (a == 1)
		{
			return 2;
		}
		if (a > 1)
		{
			result = f(a - 1) + f(a - 2);
			return result;
		}
	}



	public static int Main()
	{
		int m;
		int[] n = new int[100];
		int i;
		int j;
		double[] sum = new double[100];

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
				n[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < m;i++)
		{
			sum[i] = 0.000;
			for (j = 0;j < n[i];j++)
			{
				sum[i] += (1.000 * f(j + 1)) / (1.000 * f(j));
			}
			System.out.printf("%.3lf\n",sum[i]);
		}

		return 0;
	}
}

