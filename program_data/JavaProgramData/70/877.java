package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double max;
		double d;
		double[] y = new double[100];
		double[] x = new double[100];
		max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
			for (i = 0;i < n - 1;i++)
			{
					for (j = i + 1;j < n;j++)
					{
						d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
						if (max < d)
						{
							max = d;
						}
					}
			}

		System.out.printf("%.4f\n",max);

	return 0;
	}
}

