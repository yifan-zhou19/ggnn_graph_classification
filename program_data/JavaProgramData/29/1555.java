package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int m;
		double s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			s = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[] a = new double[m]; //????
			double[] x = new double[m + 1]; //????
			x[0] = 1;
			x[1] = 2;
			for (j = 2; j < m + 1; j++) //????
			{
				x[j] = x[j - 1] + x[j - 2];
			}
			for (j = 0; j < m; j++)
			{
				a[j] = x[j + 1] / x[j];
			}
			for (j = 0; j < m; j++)
			{
				s = s + a[j];
			}
			System.out.printf("%.3f\n", s);
		}

		return 0;
	}
}

