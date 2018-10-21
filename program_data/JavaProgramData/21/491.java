package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		double sum = 0;
		double ave = 0;
		double max = 0;
		double[] g = new double[1000];
		double[] s = new double[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			g[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + g[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			if ((g[i] - ave) > 0)
			{
				s[i] = g[i] - ave;
			}
			if ((g[i] - ave) < 0)
			{
				s[i] = ave - g[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i] >= max)
			{
				max = s[i];
				m = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i] == max && i < m)
			{
				System.out.print(g[i]);
				System.out.print(",");
			}
			if (s[i] == max && i == m)
			{
				System.out.print(g[i]);
			}
		}
		return 0;
	}

}

