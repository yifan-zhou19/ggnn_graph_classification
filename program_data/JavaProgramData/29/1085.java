package <missing>;

public class GlobalMembers
{
	public static double f(int n)
	{
		double[] x = new double[100];
		double y = 0.0;
		int i;
		x[0] = 1;
		for (i = 1;i <= n;i++)
		{
			x[i] = 1.0 / x[i - 1] + 1;
			y += x[i];
		}
		return y;
	}

	public static int Main()
	{
		int m;
		int i;
		int[] n = new int[100];
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
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",f(n[i]));
		}
		return 0;
	}

}

