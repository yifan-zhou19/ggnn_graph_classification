package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int r = 0;
		int t = 0;
		int k;
		char[][] s = new char[41][8];
		double[] d = new double[41];
		double[] b = new double[41];
		double[] g = new double[41];
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("" "");
			if (tempVar3 != null)
			{
				d[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][0] == 'm')
			{
				b[r] = d[i];
				r++;
			}
			else if (s[i][0] == 'f')
			{
				g[t] = d[i];
				t++;
			}
		}
		for (k = 1;k <= r;k++)
		{
			for (i = 0;i < r - k;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
				}
			}
		}
		for (k = 1;k <= t;k++)
		{
			for (i = 0;i < t - k;i++)
			{
				if (g[i] < g[i + 1])
				{
					e = g[i];
					g[i] = g[i + 1];
					g[i + 1] = e;
				}
			}
		}
		System.out.printf("%.2lf",b[0]);
		for (i = 1;i < r;i++)
		{
			System.out.printf(" %.2lf",b[i]);
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf(" %.2lf",g[i]);
		}
		return 0;
	}

}

