package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int gn = 0;
		int bn = 0;
		double[] h = new double[42];
		double[] g = new double[42];
		double[] b = new double[42];
		double t;
		char[][] sex = new char[42][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(sex[i],"female") == 0)
			{
				g[gn] = h[i];
				gn++;
			}
			else
			{
				b[bn] = h[i];
				bn++;
			}
		}
		for (i = 0;i < bn - 1;i++)
		{
			for (j = 0;j < bn - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		for (i = 0;i < gn - 1;i++)
		{
			for (j = 0;j < gn - i - 1;j++)
			{
				if (g[j] < g[j + 1])
				{
					t = g[j];
					g[j] = g[j + 1];
					g[j + 1] = t;
				}
			}
		}
		for (i = 0;i < bn;i++)
		{
			System.out.printf("%.2lf ",b[i]);
		}
		for (i = 0;i < gn - 1;i++)
		{
			System.out.printf("%.2lf ",g[i]);
		}
		System.out.printf("%.2lf",g[gn - 1]);
		return 0;
	}

}

