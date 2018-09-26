package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[50];
		double[] y = new double[50];
		double max = 0;
		for (int i = 0;i < n;++i)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

		}
		for (int i = 0;i < n;++i)
		{
			for (int j = i + 1;j < n;++j)
			{
				double m = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (m > max)
				{
					max = m;
				}

			}
		}
			System.out.printf("%.4f", max);
		return 0;
	}

}

