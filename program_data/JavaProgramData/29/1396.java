package <missing>;

public class GlobalMembers
{
	public static int feibonaqi(int n1)
	{
		int k;
		int[] f = new int[100];

		f[0] = 1;
		f[1] = 2;
		for (k = 2; k < n1; k++)
		{
			f[k] = f[k - 1] + f[k - 2];

		}

		return f[n1 - 1];

	}
	public static int Main()
	{
		double sum = 0;
		int i;
		int j;
		int m;
		int[] a = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < m; i++)
		{
			sum = 0;
			if (a[i] == 1)
			{
				sum = 2.000;
				System.out.printf("%.3lf\n", sum);
			}
			else
			{
				for (j = 1; j <= a[i]; j++)
				{
					sum += (feibonaqi(j + 1) * 1.0) / feibonaqi(j);
				}
				System.out.printf("%.3lf\n", sum);
			}
		}

		return 0;
	}

}

