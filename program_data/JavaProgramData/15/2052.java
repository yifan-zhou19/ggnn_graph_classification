package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1024][1024];
		int i;
		int j;
		int n;
		int c1;
		int c2;
		int k1;
		int k2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 1024;i++)
		{
			for (j = 0;j < 1024;j++)
			{
				a[i][j] = 1;
			}
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
				if (a[i][j] == 0 && a[i + 1][j] == 0 && a[i][j + 1] == 0)
				{
					c1 = i + 1;
					k1 = j + 1;
				}
				if (a[i][j] == 0 && a[i - 1][j] == 0 && a[i][j - 1] == 0)
				{
					c2 = i;
					k2 = j;
				}
			}
		}
		System.out.printf("%d\n",(c2 - c1) * (k2 - k1));
		return 0;
	}

}

