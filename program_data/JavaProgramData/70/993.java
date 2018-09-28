package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[100];
		double[] y = new double[100];
		int i;
		int j;
		int n;
		double[][] dis = new double[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double maxdis = 0;
		for (i = 1;i <= n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				dis[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (dis[i][j] > maxdis)
				{
					maxdis = dis[i][j];
				}
			}
		}
			System.out.printf("%.4f\n",maxdis);
			return 0;
	}
}

