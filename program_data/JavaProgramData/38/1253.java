package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int p;
		double[][] x = new double[100][50];
		double[] av = new double[50];
		double[] fangcha = new double[50];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
	for (p = 0;p < k;p++)
	{
		av[p] = 0;
		fangcha[p] = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i][p] = Double.parseDouble(tempVar3);
			}
		av[p] += x[i][p] / n;
		}
		for (i = 0;i < n;i++)
		{
		fangcha[p] += (x[i][p] - av[p]) * (x[i][p] - av[p]);
		}
		fangcha[p] = Math.sqrt(fangcha[p] / n);
	}
	for (p = 0;p < k;p++)
	{
		System.out.printf("%.5lf\n",fangcha[p]);
	}
		return 0;
	}

}

