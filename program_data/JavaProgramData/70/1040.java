package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] x = new double[100];
		double[] y = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		double max = 0;
		for (int j = 1;j <= n;j++)
		{
			for (int k = j + 1;k <= n;k++)
			{
					if (((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k])) >= max)
					{
					max = ((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]));
					}
			}
		}
		System.out.printf("%.4lf",Math.sqrt(max));

	}

}

