package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		double[][] a = new double[100][100];
		double[] x = new double[100];
		double[] y = new double[100];
		double max = 0;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
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
		for (i = 0;i < N;i++)
		{
			for (j = i + 1;j < N;j++)
			{
				a[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			}
		}
		for (i = 0;i < N;i++)
		{
			for (j = i + 1;j < N;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}

}

