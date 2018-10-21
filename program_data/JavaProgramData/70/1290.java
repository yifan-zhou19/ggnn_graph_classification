package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double[] y = new double[1000];
		double d = 0;
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i < n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (d > max)
				{
					max = d;
				}
			}
		}
		System.out.printf("%.4f", max);
		int q;
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

