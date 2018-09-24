package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] s = new int[100][100];
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							s[i][j] = Integer.parseInt(tempVar2);
						}
				}
		}
		int i1;
		int i2;
		int j1;
		int j2;
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
						if (s[i][j] == 0)
						{
								i1 = i;
								j1 = j;
								break;
						}
				}
		}
		for (i = n;i >= 1;i--)
		{
				for (j = n;j >= 1;j--)
				{
						if (s[i][j] == 0)
						{
								i2 = i;
								j2 = j;
								break;
						}
				}
		}
		int sq;
		sq = (j2 - j1 - 1) * (i1 - i2 - 1);
		System.out.printf("%d\n",sq);
		return 0;
	}
}

