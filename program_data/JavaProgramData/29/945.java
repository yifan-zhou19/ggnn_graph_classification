package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int m;
		int[] n = new int[10000];
		int i;
		int max = 0;
		int e;
		double[] c = new double[10000];
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
			if (max < n[i])
			{
				max = n[i];
			}
		}
		a[0] = 2;
		a[1] = 3;
		b[0] = 1;
		b[1] = 2;
		c[0] = 2;
		for (i = 2;i < max;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
			a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 1;i < max;i++)
		{
			c[i] = c[i - 1] + 1.0 * a[i] / b[i];
		}
		for (i = 0;i < m;i++)
		{
			e = n[i] - 1;
			System.out.printf("%.3lf\n",c[e]);
		}
		return 0;
	}
}

