package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] shuzi = new double[10000];
		double[] fenshu = new double[10000];
		int i;
		int j;
		int n;
		int m;
		double sum = 0;
		shuzi[0] = 1;
		shuzi[1] = 2;
		for (i = 2;i < 10000;i++)
		{
			shuzi[i] = shuzi[i - 2] + shuzi[i - 1];
		}
		for (i = 0;i < 10000;i++)
		{
			fenshu[i] = shuzi[i + 1] / shuzi[i];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + fenshu[i];
		}
		System.out.printf("%.3lf\n", sum);
		sum = 0;
		}
		return 0;
	}
}

