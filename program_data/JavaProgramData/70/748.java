package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double max = 0;
		double m;
		double[] x = new double[1000];
		double[] y = new double[1000];
		int n;
		int i;
		int j;
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
			for (j = 1;j < n;j++)
			{
				m = Math.pow(x[j] - x[i],2) + Math.pow(y[j] - y[i],2);
				if (m > max)
				{
					max = m;
				}
			}
		}
			System.out.printf("%.4lf\n",Math.sqrt(max));
			return 0;
	}

}

