package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 1;
		int j = 1;
		double dis;
		double[] x = new double[100];
		double[] y = new double[100];
		double[][] d = new double[100][100];
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n = Integer.parseInt(tempVar);
				}
		/*??????*/
		for (i = 1; i <= n; i++)
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

		/*????????*/
		for (i = 1; i <= n; i++)
		{
			for (j = 1;j <= n; j++)
			{
				d[i][j] = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
			}
		}
		/*???????*/
		dis = d[1][1];
		for (i = 1; i <= n; i++)
		{
			for (j = 1;j <= n; j++)
			{
				if (d[i][j] >= dis)
				{
					dis = d[i][j];
				}
			}
		}
		System.out.printf("%.4f\n", dis);
	}
}

