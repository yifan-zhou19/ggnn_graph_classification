package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		double[] b = new double[100];
		double[][] c = new double[100][100];
		double[] d = new double[10000];
		double[] e = new double[10000];
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				c[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
			}
		}
		k = 1;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
					d[k] = c[i][j];
					k += 1;
			}
		}
		for (i = 1; i <= n * n; i++)
		{
			k = 1;
			for (j = 1; j <= n * n; j++)
			{
				if (d[i] > d[j])
				{
					k += 1;
				}
			}
			e[k] = d[i];
		}
		System.out.printf("%.4lf", e[n * n - 1]);
		return 0;
	}
}

