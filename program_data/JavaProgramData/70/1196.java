package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double dis = 0;
		double[] x = new double[101];
		double[] y = new double[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j != i && j <= n;j++)
			{
				if (dis < Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j])))
				{
					dis = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				}
			}
		}
		System.out.printf("%.4f\n", dis);
	return 0;
	}
}

