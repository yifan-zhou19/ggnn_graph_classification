package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] mon = new int[301];
		int i;
		int j;
		int p;
		int k;
		for (;;)
		{
			p = 1;
			for (i = 0; i < 301; i++)
			{
				mon[i] = 2;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			else
			{
				for (i = 1; i <= n; i++)
				{
					mon[i] = 1;
				}
				for (k = 0; k < n - 1; k++)
				{
					for (i = p % n, j = 1; j <= m; i++, j++)
					{
						i = i % n + (i % n == 0) * n;
						if (mon[i] == 0)
						{
							j -= 1;
						}
						else
						{
							;
						}
						if (j == m)
						{
							mon[i] = 0;
						}
						else
						{
							;
						}
					}
					p = i;
				}
				for (i = 1; i <= n; i++)
				{
					if (mon[i] == 1)
					{
						System.out.printf("%d\n", i);
						break;
					}
					else
					{
						;
					}
				}
			}
		}
	}

}

