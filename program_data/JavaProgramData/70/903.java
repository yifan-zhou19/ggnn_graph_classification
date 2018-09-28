package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[10000];
		double[] y = new double[10000];
		for (int i = 0;i < m;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double max;
		double z;
		max = 0.0;
		for (int k = 0;k < m;k++)
		{
			for (int l = 0;l < m;l++)
			{
				z = Math.sqrt(Math.pow((x[l] - x[k]),2.0) + Math.pow((y[l] - y[k]),2.0));
			if (max < z)
			{
				max = z;
			}
			}
		}
		System.out.printf("%.4f", max);
		System.out.printf("%.4f", "\n");
		return 0;
	}
}

