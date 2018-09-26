package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] s = new int[max + 2][max + 2];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= m + 1;i++)
		{
			s[i][0] = s[i][n + 1] = 0;
		}
		for (j = 0;j <= n + 1;j++)
		{
			s[0][j] = s[m + 1][j] = 0;
		}
	for (i = 1;i <= m;i++)
	{
			for (j = 1;j <= n;j++)
			{
				if (s[i - 1][j] <= s[i][j] != 0 && s[i + 1][j] <= s[i][j] != 0 && s[i][j + 1] <= s[i][j] != 0 && s[i][j - 1] <= s[i][j])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
	}
		return 0;
	}


}

