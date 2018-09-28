package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 1;j <= n / 2 + 1 || j <= m / 2 + 1;j++)
		{
			for (i = j - 1;i < n + 1 - j;i++)
			{
				System.out.printf("%d\n",a[j - 1][i]);
			}
			for (i = j;i < m + 1 - j;i++)
			{
				System.out.printf("%d\n",a[i][n - j]);
			}
			if (j >= m + 1 - j)
			{
				break;
			}
			for (i = n - j - 1;i >= j - 1;i--)
			{
				System.out.printf("%d\n",a[m - j][i]);
			}
			if (n - j - 1 < j - 1)
			{
				break;
			}
			for (i = m - j - 1;i >= j;i--)
			{
				System.out.printf("%d\n",a[i][j - 1]);
			}
		}

	}
}

