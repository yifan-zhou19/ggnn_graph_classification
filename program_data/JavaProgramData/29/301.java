package <missing>;

public class GlobalMembers
{
		public static int fblq(int n)
		{
	if (n == 0)
	{
	return 1;
	}
	if (n == 1)
	{
	return 2;
	}
	return fblq(n - 1) + fblq(n - 2);
		}
	public static int Main()
	{
		int k;
		int m;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		sum = 0;
		for (int j = 1;j <= m;j++)
		{
			sum += fblq(j) * 1.0 / fblq(j - 1);
		}
		System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

