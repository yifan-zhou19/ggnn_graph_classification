package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[10];
		double[] y = new double[10];
		int n;
		int i;
		int j;
		double a;
		double b;
		double d;
		double dmax = 0;
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
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			x[i] = a;
			y[i] = b;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (d > dmax)
				{
					dmax = d;
				}
			}
		}
		System.out.printf("%.4f",dmax);
	}


}

