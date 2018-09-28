package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int n;
		double a;
		double[] x = new double[128];
		double s;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = 0.0;
			for (int i = 0; i < n; ++i)
			{
				x[i] = ConsoleInput.readToWhiteSpace(true);
				a += x[i];
			}
			a = a / n;
			s = 0.0;
			for (int i = 0; i < n; ++i)
			{
				s += (x[i] - a) * (x[i] - a);
			}
			s /= n;
			System.out.printf("%.5lf\n", Math.sqrt(s));
		}
	}
}

