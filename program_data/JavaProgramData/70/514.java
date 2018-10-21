package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double[] x = new double[70];
		double[] y = new double[70];
		double d;
		double max;
		double M;
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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
			for (i = 0;i < n;i++)
			{
				for (k = i + 1;k < n;k++)
				{
					d = Math.sqrt((x[k] - x[i]) * (x[k] - x[i]) + (y[k] - y[i]) * (y[k] - y[i]));
					if (max < d)
					{
						max = d;
					}
				}

			}
			if (M < max)
			{
				M = max;
			}
		System.out.printf("%.4lf",M);
		return 0;
	}
}

