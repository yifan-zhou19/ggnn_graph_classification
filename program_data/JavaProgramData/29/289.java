package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		double[] t = new double[1000];
		double[] sum = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			b[0] = 1;
			a[1] = 1,b[1] = 2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n >= 2)
			{
				for (j = 2;j <= n;j++)
				{
				   a[j] = b[j - 1];
				   b[j] = b[j - 1] + b[j - 2];
				   t[j] = 1.0 * b[j] / a[j];
				   sum[i] += t[j];
				}
				sum[i] = sum[i] + 2.000;
			}
			else
			{
				sum[i] = 2.000;
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}
}

