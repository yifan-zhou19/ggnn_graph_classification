package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i += 2)
		{
			t = n - i;
			p = (int)Math.sqrt(i);
			q = (int)Math.sqrt(t);
		for (j = 2;j <= p;j++)
		{
			if (i % j == 0)
			{
				break;
			}
		}
		for (k = 2;k <= q;k++)
		{
			if (t % k == 0)
			{
				break;
			}
		}
		if (j > p && k > q)
		{
			System.out.printf("%d %d\n",i,t);
		}
		}
		return 0;
	}

}

