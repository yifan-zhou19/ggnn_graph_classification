package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int m;
		int i;
		int j;
		int s = 1;
		m = Math.sqrt(n);
		for (i = 2;i <= m;i++)
		{
			for (j = m;j <= n;j++)
			{
				if (n == i * j)
				{
					s = 0;
					return 1;
					break;
				}
			}
		}
		if (s == 1)
		{
			return 2;
		}
	}

	public static int Main()
	{
		int t;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 3;k <= t / 2;k++)
		{
			if (F(k) == 2)
			{
				p = t - k;
				if (F(p) == 2)
				{
					System.out.printf("%d %d\n",k,p);
				}
			}
		}
		return 0;
	}
}

