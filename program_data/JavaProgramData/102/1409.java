package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int bb = 0;
		int gg = 0;
		String str = new String(new char[10]);
		double[] b = new double[41];
		double[] g = new double[41];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (str.charAt(0) == 'm')
			{
				bb++;
				b[bb] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			if (str.charAt(0) == 'f')
			{
				gg++;
				g[gg] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int j;
		double t;
		for (i = 1; i <= bb - 1; i++)
		{
			for (j = 1; j <= bb - i; j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}

		for (i = 1; i <= bb; i++)
		{
			System.out.printf("%.2f", b[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 1; i <= gg - 1; i++)
		{
			for (j = 1; j <= gg - i; j++)
			{
				if (g[j] < g[j + 1])
				{
					t = g[j];
					g[j] = g[j + 1];
					g[j + 1] = t;
				}
			}
		}
		for (i = 1; i <= gg; i++)
		{
			if (i < gg)
			{
				System.out.printf("%.2f", g[i]);
				System.out.printf("%.2f", " ");
			}
			else
			{
				System.out.printf("%.2f", g[i]);
			}
		}
		return 0;
	}

}

