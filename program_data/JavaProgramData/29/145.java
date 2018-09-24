package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100];
		int i;
		int m;
		int j;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] a = new double[100];
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
			x[0] = 2;
			y[0] = 1;
			x[1] = 3;
			y[1] = 2;
			a[i] = x[0] / y[0];
			for (j = 1;j < n[i];j++)
			{
				if (j > 1)
				{
					x[j] = x[j - 1] + x[j - 2];
					y[j] = y[j - 1] + y[j - 2];
				}
				a[i] = a[i] + x[j] / y[j];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",a[i]);
		}
		return 0;
	}
}

