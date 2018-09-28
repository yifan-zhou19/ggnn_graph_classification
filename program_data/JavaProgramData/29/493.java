package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] fib = new int[10000];
		double[] sz = new double[10000];
		double ans;
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			fib[0] = 1;
			fib[1] = 1;
			for (i = 2;i < n + 2;i++)
			{
				fib[i] = fib[i - 1] + fib[i - 2];
			}
			ans = 0;
			for (i = 0;i < n;i++)
			{
				sz[i] = (double)fib[i + 2] / (double)fib[i + 1];
				ans = ans + sz[i];
			}
			System.out.printf("%.3lf\n",ans);
		}
		return 0;
	}

}

