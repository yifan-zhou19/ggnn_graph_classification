package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int t;
		int j;
		int k;
		int p;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			a = 1;
			t = i;
			p = m - i;
			for (j = 2;j <= t / 2;j++)
			{
				if (t % j == 0)
				{
					a = 0;
				break;
				}
			}
			for (k = 2;k <= p / 2;k++)
			{
				if (p % k == 0)
				{
					a = 0;
				break;
				}
			}
			if (a != 0)
			{
			System.out.printf("%d %d\n",t,p);
			}
		}

	}
}

