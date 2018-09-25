package <missing>;

public class GlobalMembers
{
	public static double ca(double x,double y)
	{
		return x * x + y * y;
	}
	public static int Main()
	{
		double[] x = new double[50];
		double[] y = new double[50];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[0] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[0] = Double.parseDouble(tempVar3);
		}
		double max = 0;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				y[i] = Double.parseDouble(tempVar5);
			}
			for (j = 0;j < i;j++)
			{
				if (ca(x[j] - x[i], y[j] - y[i]) > max)
				{
				max = ca(x[j] - x[i], y[j] - y[i]);
				}
			}
		}
		System.out.printf("%.4lf\n",Math.sqrt(max));

	}

}

