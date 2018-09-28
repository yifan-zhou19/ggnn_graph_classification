package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[100];
		double[] b = new double[100];
		int i;
		int j;
		double[][] c = new double[100][100];
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				c[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
			}
		}
		double m = 0.00;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (c[i][j] > m)
				{
					m = c[i][j];
				}
			}
		}
		System.out.printf("%.4f", m);
		System.out.printf("%.4f", "\n");
		return 0;
	}
}

