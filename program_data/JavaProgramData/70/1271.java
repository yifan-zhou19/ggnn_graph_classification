package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		double[] x = new double[100];
		double[] y = new double[100];
		double[][] z = new double[100][100];
		double w;
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
				z[i][j] = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2));
			}
		}
		w = z[0][1];
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (w < z[i][j])
				{
					w = z[i][j];
				}
			}
		}
		System.out.printf("%.4f\n",w);
		return 0;
	}
}

