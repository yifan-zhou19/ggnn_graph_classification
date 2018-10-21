package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] n = new int[100];
		double[][] z = new double[100][100];
		double[] x = new double[100];
		double[] y = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					z[i][j] = Double.parseDouble(tempVar3);
				}
				x[i] = x[i] + z[i][j];
			}
			x[i] = x[i] / (double)n[i];
			for (int t = 0;t < n[i];t++)
			{
				y[i] = y[i] + (z[i][t] - x[i]) * (z[i][t] - x[i]);
			}
			y[i] = Math.sqrt(y[i] / (double)n[i]);
			System.out.printf("%.5lf\n",y[i]);
		}
		return 0;
	}


}

