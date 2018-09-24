package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//



	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int m = 0;
		int k = 0;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;++i)
		{
			for (j = 0;j <= n - 1;++j)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i <= n - 1;++i)
		{
			for (j = 0;j <= n - 1;++j)
			{
				if (a[i][j] == 255)
				{
					m = m + 1;
				}
			}
		}
		for (i = 0;i <= n - 1;++i)
		{
			for (j = 0;j <= n - 1;++j)
			{
				if (a[i][j] == 255)
				{
					k = k + 1;
				}
				else
				{
					break;
				}
			}
			if (j == n)
			{
				continue;
			}
			else
			{
			for (j = n - 1;j >= 0;--j)
			{
				if (a[i][j] == 255)
				{
					k = k + 1;
				}
				else
				{
					break;
				}
			}
			}
		}
		s = m - k;
		System.out.printf("%d\n",s);
		return 0;
	}

}

