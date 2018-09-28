package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double[][] y = new double[100][99];
		double k;
		double[][] x = new double[100][2];

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
				x[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				 y[i][j] = Math.sqrt((x[j][0] - x[i][0]) * (x[j][0] - x[i][0]) + (x[j][1] - x[i][1]) * (x[j][1] - x[i][1]));
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			for (j = i + 1;j < n - 1;j++)
			{
				 if (y[i][j] > y[i][j + 1])
				 {
					k = y[i][j];
					y[i][j] = y[i][j + 1];
					y[i][j + 1] = k;
				 }
			}
		}
			for (i = 0;i < n - 1;i++)
			{
				if (y[i][n - 1] > y[i + 1][n - 1])
				{
					k = y[i][n - 1];
					y[i][n - 1] = y[i + 1][n - 1];
					y[i + 1][n - 1] = k;
				}
			}
			System.out.printf("%.4lf\n",y[n - 1][n - 1]);
	}
}

