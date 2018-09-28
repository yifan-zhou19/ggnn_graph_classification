package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] x = new double[1000];
		double[] y = new double[1000];
		double[][] d = new double[1000][1000];
		double dis = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				d[i][j] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (d[i][j] > dis)
				{
					dis = d[i][j];
				}
			}
		}
		dis = Math.sqrt(dis);
		System.out.printf("%.4f\n",dis);
		return 0;
	}
}

