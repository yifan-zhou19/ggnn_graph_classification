package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] s = new int[27][27];
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
		for (i = 0;i < m + 2;i++)
		{
			s[i][0] = 0;
		}
	for (i = 0;i < m + 2;i++)
	{
			s[i][n + 1] = 0;
	}
	for (i = 0;i < n + 2;i++)
	{
			s[0][i] = 0;
	}
	for (i = 0;i < n + 2;i++)
	{
			s[m + 1][i] = 0;
	}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
			   if (s[i][j] >= s[i + 1][j] != 0 && s[i][j] >= s[i - 1][j] != 0 && s[i][j] >= s[i][j - 1] != 0 && s[i][j] >= s[i][j + 1])
			   {
				   System.out.printf("%d %d\n",i - 1,j - 1);
			   }
			}
		}
	return 0;
	}
}

