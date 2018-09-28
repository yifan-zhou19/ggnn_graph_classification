package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		if (x == 1)
		{
		   return 1;
		}
		else if (x == 2)
		{
		   return 2;
		}
		else
		{
		   return (f(x - 1) + f(x - 2));
		}
	}
	public static int Main()
	{
		int m;
		int[] n = new int[1000];
		int i;
		int k;
		double[] sum = new double[1000];
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
			sum[i] = 0;
			for (k = 1;k <= n[i];k++)
			{
				 sum[i] = sum[i] + f(k + 1) * 1.0 / f(k);
			}
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}
}

