package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double max;
		double xd;
		double yd;
		double d;
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double[] y = new double[10000];

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
		max = 0;
		d = 0;

		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n;j++)
			{
				xd = x[i] - x[j];
				yd = y[i] - y[j];
				d = Math.sqrt(xd * xd + yd * yd);
				if (d > max)
				{
					max = d;
				}
			}
		}
		System.out.printf("%.4lf\n", max);
		  return 0;
	}

}

