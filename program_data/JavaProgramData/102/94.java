package <missing>;

public class GlobalMembers
{
	public static double[] f = new double[100];
	public static double[] g = new double[100];

	public static int Main()
	{
		int m = 0;
		int n = 0;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		while (t-- != 0)
		{
			double tmp;
			String sx = new String(new char[10]);
			sx = ConsoleInput.readToWhiteSpace(true).charAt(0);
			tmp = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(sx,"male") == 0)
			{
				f[m++] = tmp;
			}
			else
			{
				g[n++] = tmp;
			}
		}
		sort(f,f + m);
		sort(g,g + n);
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2f ", f[i]);
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (i != 0)
			{
				System.out.printf("%.2f ", g[i]);
			}
			else
			{
				System.out.printf("%.2f", g[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

