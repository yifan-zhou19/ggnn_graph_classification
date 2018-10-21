package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] d = new double[5000];
		double m = 0;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
			d[i] = Math.sqrt(x[i] * x[i] + y[i] * y[i]);
		}
		for (i = 0;i <= n - 2;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				d[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				k++;
			}
		}
		for (i = 0;i <= k - 1;i++)
		{
			if (d[i] > m)
			{
				m = d[i];
			}
		}
		System.out.printf("%.4f\n",m);
		return 0;
	}
}

