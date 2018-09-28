package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		double[] d = new double[1000];
		double[] sum = new double[1000];
		b[0] = 2;
		c[0] = 1;
		b[1] = 3;
		c[1] = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			for (k = 0;k < a[i];k++)
			{
				if (k >= 2)
				{
					b[k] = b[k - 1] + b[k - 2];
					c[k] = c[k - 1] + c[k - 2];
				}
				d[k] = b[k] / (double)(c[k]);
				sum[i] += d[k];
			}
			System.out.printf("%.3f\n",sum[i]);
		}
		return 0;
	}
}

