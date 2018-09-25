package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		double z = 0;
		double[] t = new double[M];

		int[] xf = new int[M];
		int[] g = new int[M];
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
				xf[i] = Integer.parseInt(tempVar2);
			}
			sum += xf[i];

		}

		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g[i] = Integer.parseInt(tempVar3);
			}
			if (g[i] < 60)
			{
				t[i] = 0;
			}
			if (g[i] >= 60 && g[i] <= 63)
			{
				t[i] = 1.0;
			}
			if (g[i] >= 64 && g[i] <= 67)
			{
				t[i] = 1.5;
			}
			if (g[i] >= 68 && g[i] <= 71)
			{
				t[i] = 2.0;
			}
			if (g[i] >= 72 && g[i] <= 74)
			{
				t[i] = 2.3;
			}
			if (g[i] >= 75 && g[i] <= 77)
			{
				t[i] = 2.7;
			}
			if (g[i] >= 78 && g[i] <= 81)
			{
				t[i] = 3.0;
			}
			if (g[i] >= 82 && g[i] <= 84)
			{
				t[i] = 3.3;
			}
			if (g[i] >= 85 && g[i] <= 89)
			{
				t[i] = 3.7;
			}

			if (g[i] >= 90)
			{
				t[i] = 4.0;
			}

			z += t[i] * xf[i];

		}
		System.out.printf("%.2lf",z / sum);


		return 0;

	}


}

