package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sz =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[][] szs = new int[102][102];
		int n;
		int m;
		int i;
		int j;
		int s = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar2 != null)
				{
					sz[i][j] = tempVar2.charAt(0);
				}
				if (sz[i][j] == '@')
				{
					s++;
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 0;k < m - 1;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (sz[i][j] == '@')
					{
						szs[i][j] = 1;
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (szs[i][j] == 1)
					{
						if (sz[i - 1][j] == '.')
						{
							sz[i - 1][j] = '@';
							s++;
						}
						if (sz[i + 1][j] == '.')
						{
							sz[i + 1][j] = '@';
							s++;
						}
						if (sz[i][j + 1] == '.')
						{
							sz[i][j + 1] = '@';
							s++;
						}
						if (sz[i][j - 1] == '.')
						{
							sz[i][j - 1] = '@';
							s++;
						}
					}
				}
			}
		}
		System.out.printf("%d",s);
		return 0;
	}
}

