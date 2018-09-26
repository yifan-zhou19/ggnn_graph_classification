package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int u;
		double add;
		double[] each1 = new double[100];
		double[] each2 = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			each1[0] = 2;
			each1[1] = 3;
			each2[0] = 1;
			each2[1] = 2;
			add = 3.5;
			for (u = 2;u < n;u++)
			{
				each1[u] = each1[u - 1] + each1[u - 2];
				each2[u] = each2[u - 1] + each2[u - 2];
				add += 1.0 * each1[u] / each2[u];
			}
			if (n == 1)
			{
				System.out.print("2.000\n");
			}
			else
			{
				System.out.printf("%.3lf\n",add);
			}
		}
		return 0;
	}
}

