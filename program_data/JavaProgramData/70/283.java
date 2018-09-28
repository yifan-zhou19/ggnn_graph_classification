package <missing>;

public class GlobalMembers
{
	public static double f(double x,double y)
	{
		return (x * x + y * y);
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		double max = 0;
		double d;
		double[] x = new double[100];
		double[] y = new double[100];
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n;j++)
			{
				d = Math.sqrt(Math.abs(f((x[i] - x[j]), (y[i] - y[j]))));
				if (d > max)
				{
					max = d;
				}


			}
		}
		System.out.printf("%.4lf\n",max);

	}

}

