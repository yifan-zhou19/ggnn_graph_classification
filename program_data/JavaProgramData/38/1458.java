package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[102];
		double s = 0;
		double av = 0;
		for (int k = 0;k < m;k++)
		{
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 s = 0;
			for (int i = 0;i < n;i++)
			{
				a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				s += a[i];
			}
			av = s / n;
			s = 0;
			for (int i = 0;i < n;i++)
			{
				s += (a[i] - av) * (a[i] - av);
			}
			System.out.printf("%.5f", Math.sqrt(s / n));
			System.out.printf("%.5f", "\n");

		}
	}

}

