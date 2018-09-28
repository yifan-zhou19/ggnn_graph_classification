package <missing>;

public class GlobalMembers
{
	/*?????(x,y)????????????????*/

	public static double compare(double[] x, double[] y, int n)
	{
		int i;
		int j;
		double m;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i])) > m)
				{
					m = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
				}
			}
		}
		return m;
	}

	public static void Main()
	{
		int n;
		int k;
		double[] b = new double[10];
		double[] a = new double[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[k] = Double.parseDouble(tempVar3);
			}
		}
		System.out.printf("%.4lf\n",compare(a, b, n));
	}



}

