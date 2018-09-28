package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n = 0;
		double[] a = new double[1000];
		double[] x = new double[1000];
		double m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			x[i] = 0;
			m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
				m = m + a[j];
			}
			for (j = 0;j < n;j++)
			{
				x[i] = (double)(a[j] - m / (float)n) * (a[j] - m / (float)n) + x[i];
			}
		System.out.printf("%0.5lf\n",Math.sqrt(x[i] / (float)n));
		}

		return 0;
	}

}

