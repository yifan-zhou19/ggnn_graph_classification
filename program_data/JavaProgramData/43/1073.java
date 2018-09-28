package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int t;
		int l;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= m / 2;i++)
		{
			t = 1;
			l = 1;
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
					t = -1;
					break;
				}
			}
			if (t == 1 && i % 2 != 0)
			{
				n = m - i;
				for (j = 2;j <= n / 2;j++)
				{
					if (n % j == 0)
					{
						l = -1;
						break;
					}
				}
				if (l == 1 && l % 2 != 0)
				{
					System.out.printf("%d %d\n",i,n);
				}
			}
		}
		return 0;
	}
}

