package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[1000][1000];
		int m = 0;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 0 && a[i][j + 1] != 0)
				{
					break;
				}
			}
			p = j;
			for (j = n;j >= 0;j--)
			{
				if (a[i][j] == 0 && a[i][j - 1] != 0)
				{
					break;
				}
			}
			q = j;
			if (q > p)
			{
				m = m + q - p - 1;
			}
		}
		System.out.printf("%d\n",m);
		return 0;
	}
}

