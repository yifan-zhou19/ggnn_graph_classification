package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[1000];
		double[] y = new double[1000];
		double[][] d = new double[1000][1000];
		double max;
		max = 0;
		for (i = 0; i < n; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				d[i][j] = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
				if (d[i][j] > max)
				{
					max = d[i][j];
				}
			}
		}
		System.out.printf("%.4f", max);
		System.out.printf("%.4f", "\n");
	return 0;
	}
}

