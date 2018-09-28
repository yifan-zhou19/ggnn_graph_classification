package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int N = 100;
		double[] a = new double[N];
		double b;
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
			a[0] = 1.0;
			a[1] = 2.0;
			b = 0;
			for (k = 2;k <= n + 1;k++)
			{
				a[k] = a[k - 1] + a[k - 2];
				b = b + (a[k - 1] / a[k - 2]);
			}
			System.out.printf("%.3lf\n",b);
		}
		return 0;
	}
}

