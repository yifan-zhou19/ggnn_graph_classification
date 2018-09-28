package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zhishu = int x;
		int m;
		int i;
		int k;
		int n;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= m / 2;i++)
		{
			n = m - i;
			k = zhishu(i);
			p = zhishu(n);
			if (p == 1 && k == 1)
			{
				System.out.printf("%d %d\n",i,n);
			}
		}
		return 0;
	}
	public static int zhishu(int x)
	{
		int i;
		int j;
		int k;
		if (x == 2)
		{
			k = 1;
		}
		else
		{
			for (i = 2;i < x;i++)
			{
				j = x % i;
				if (j == 0)
				{
						k = 0;
						break;
				}
				else
				{
					if (i == x - 1)
					{
						k = 1;
					}
				}
			}
		}
			return k;
	}

}

