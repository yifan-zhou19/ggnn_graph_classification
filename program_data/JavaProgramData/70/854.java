package <missing>;

public class GlobalMembers
{
	public static double[] x = new double[10000];
	public static double[] y = new double[10000];

	public static int Main()
	{
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; ++i)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double ans = 0.0;
		for (i = 0; i < n; ++i)
		{
			for (j = i + 1; j < n; ++j)
			{
				double dist = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (dist > ans)
				{
					ans = dist;
				}
			}
		}
		System.out.printf("%.4lf\n", ans);
		return 0;
	}
}

