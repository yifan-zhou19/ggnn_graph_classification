package <missing>;

public class GlobalMembers
{
	public static void px(double[] sz, int n)
	{
		int i;
		int k;
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i <= n - k - 1;i++)
			{
				if (sz[i] >= sz[i + 1])
				{
					double ex;
					ex = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = ex;
				}
			}
		}
	}
	public static int Main()
	{
		String s = new String(new char[10]);
		double hehe;
		double[] b = new double[40];
		double[] g = new double[40];
		int by = 0;
		int gl = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				hehe = Double.parseDouble(tempVar3);
			}
			if (strcmp(s,"female") == 0)
			{
				g[gl] = hehe;
				gl++;
			}
			else
			{
				b[by] = hehe;
				by++;
			}
		}
		px(b, by);
		px(g, gl);
		System.out.printf("%.2lf",b[0]);
		for (i = 1;i < by;i++)
		{
			System.out.printf(" %.2lf",b[i]);
		}
		for (i = gl - 1;i >= 0;i--)
		{
			System.out.printf(" %.2lf",g[i]);
		}
		return 0;
	}
}

