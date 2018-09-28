package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p = 0;
		int m;
		char[][] room =
		{
			{'#', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				room[i] = tempVar2.charAt(0);
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
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '@')
				{
					if (room[i - 1][j] == '.')
					{
						room[i - 1][j] = '*';
					}
					if (room[i + 1][j] == '.')
					{
						room[i + 1][j] = '*';
					}
					if (room[i][j - 1] == '.')
					{
						room[i][j - 1] = '*';
					}
					if (room[i][j + 1] == '.')
					{
						room[i][j + 1] = '*';
					}
				}
			}
		}
			for (i = 1;i <= n;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '*')
				{
					room[i][j] = '@';
				}
			}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '@')
				{
					p++;
				}
			}
		}
		System.out.printf("%d",p);
		return 0;
	}
}

