package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[101];
		double[] y = new double[101];
		for (int i = 1; i <= n; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double[][] dis = new double[101][101];
		double max = 0;
		for (int i = 1; i <= n - 1; i++)
		{
			for (int j = i + 1; j <= n; j++)
			{
				dis[i][j] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				dis[i][j] = Math.sqrt(dis[i][j]);
				if (dis[i][j] > max)
				{
					max = dis[i][j];
				}
			}
		}
		System.out.printf("%.4lf\n", max);
		return 0;
	}
}

