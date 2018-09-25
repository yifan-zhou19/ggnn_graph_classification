package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double dis;
		double[] x = new double[100];
		double[] y = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		dis = Math.sqrt((x[1] - x[0]) * (x[1] - x[0]) + (y[1] - y[0]) * (y[1] - y[0]));
		for (i = 0; i <= n - 2; i++)
		{
			for (j = i + 1; j <= n - 1; j++)
			{
				if (Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i])) > dis)
				{
					dis = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
				}
			}
		}
		System.out.printf("%.4f", dis);
		System.out.printf("%.4f", "\n");
		return 0;
	}
}

