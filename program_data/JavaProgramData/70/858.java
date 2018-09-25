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
		double[][] s = new double[1000][1000];
		double max = 0;
		double d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)

			{
				d = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				s[i][j] = Math.sqrt(d);
			if (s[i][j] > max)
			{
				max = s[i][j];
			}

			}
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}

}

