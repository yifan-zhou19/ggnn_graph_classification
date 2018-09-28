package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int q;
		int p;
		double[] a = new double[100];
		double sum;
		a[0] = 1;
		a[1] = 2;
		for (i = 2;i <= 99;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= m - 1;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j <= n - 1;j++)
			{
				sum += (a[j + 1] / a[j]);
			}
			System.out.printf("%.3lf\n",sum);
		}
	}

}

