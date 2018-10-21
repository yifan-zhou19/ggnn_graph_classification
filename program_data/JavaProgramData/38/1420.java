package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		double[] x = new double[100];
		double S;
		double a;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < m; ++i)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = 0;
			for (int j = 0; j < n; ++j)
			{
				x[j] = ConsoleInput.readToWhiteSpace(true);
				a += x[j];
			}
			a /= n;
			S = 0;
			for (int j = 0; j < n; ++j)
			{
				S += (x[j] - a) * (x[j] - a);
			}
			S = Math.sqrt(S / n);
			System.out.printf("%.5f\n", S);
		}
		return 0;
	}
}

