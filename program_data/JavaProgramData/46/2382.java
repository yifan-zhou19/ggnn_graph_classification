package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int m;
		int n;
		int i;
		int j;
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (m > n)
		{
			s = n;
		}
		else
		{
			s = m;
		}
		i = 1;
		if (s % 2 == 0)
		{
			for (t = 1;t <= s / 2;t++)
			{
				for (j = t;j <= n - t + 1;j++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				for (i = 1 + t;i <= m + 1 - t;i++)
				{
					System.out.printf("%d\n",a[i][j - 1]);
				}
				i = i - 1;
				for (j = n - t;j >= t;j--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				j = j + 1;
				for (i = m - t;i >= t + 1;i--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				i = i + 1;
			}
		}
		else
		{
			i = 1;
			for (t = 1;t <= (s - 1) / 2;t++)
			{
				for (j = t;j <= n - t + 1;j++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				for (i = 1 + t;i <= m + 1 - t;i++)
				{
					System.out.printf("%d\n",a[i][j - 1]);
				}
				i = i - 1;
				for (j = n - t;j >= t;j--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				j = j + 1;
				for (i = m - t;i >= t + 1;i--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				i = i + 1;
			}
			if (m < n)
			{
				for (j = (s + 1) / 2;j <= (n - (s - 1) / 2);j++)
				{
					System.out.printf("%d\n",a[(s + 1) / 2][j]);
				}
			}
			else
			{
				for (i = (s + 1) / 2;i <= (m - (s - 1) / 2);i++)
				{
					System.out.printf("%d\n",a[i][(s + 1) / 2]);
				}
			}
		}
		return 0;
	}

}

