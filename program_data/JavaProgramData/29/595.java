package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[100];
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		double[] c = new double[100];
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
			for (j = 0;j < n[i];j++)
			{
				if (j == 0 || j == 1)
				{
					b[j] = 1 + j;
				}
				else if (j > 1)
				{
					b[j] = b[j - 2] + b[j - 1];
				}
				if (j == 0 || j == 1)
				{
					a[j] = 2 + j;
				}
				else if (j > 1)
				{
					a[j] = a[j - 2] + a[j - 1];
				}
				c[j] = 1.0 * a[j] / b[j];
				sum[i] = sum[i] + c[j];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}
}

