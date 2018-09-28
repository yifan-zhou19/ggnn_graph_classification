package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] n = new int[999];
		double sum;
		double[] x = new double[999];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		x[0] = 1.0;
		x[1] = 2.0;
		for (i = 3;i <= 999;i++)
		{
			x[i - 1] = x[i - 2] + x[i - 3];
		}
		for (i = 1;i <= m;i++)
		{
			   sum = 0;
			for (j = 1;j <= n[i - 1];j++)
			{
			sum = sum + x[j] / x[j - 1];
			}
			System.out.printf("%.3lf\n",sum);
		}

		return 0;
	}
}

