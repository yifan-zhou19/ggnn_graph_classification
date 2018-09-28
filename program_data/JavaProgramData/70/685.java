package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double[][] a = new double[101][101];
		double[] c = new double[101];
		double[] d = new double[101];
		double max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d[i] = Double.parseDouble(tempVar3);
			}
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Math.sqrt((c[i] - c[j]) * (c[i] - c[j]) + (d[i] - d[j]) * (d[i] - d[j]));
			}
		}

		max = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}

		System.out.printf("%.4lf\n",max);
	}
}

