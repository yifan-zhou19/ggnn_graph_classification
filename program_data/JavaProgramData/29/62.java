package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int h;
		int n;
		double[] sum = new double[1000];
		int[] a = new int[1000];
		int[] c = new int[1000];
		double[] b = new double[1000];

		c[0] = 1;
		c[1] = 2;
		for (n = 2;n < 1000;n++)
		{
			c[n] = c[n - 1] + c[n - 2];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			sum[j] = 0;
		}

	   for (i = 0;i < m;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }

		   for (k = 0;k < a[i];k++)
		   {
			 b[k] = 1.0 * c[k + 1] / c[k];
			 sum[i] = sum[i] + b[k];
		   }
	   }

		for (h = 0;h < m;h++)
		{
		System.out.printf("%.3lf\n",sum[h]);
		}


		return 0;

	}
}

