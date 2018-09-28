package <missing>;

public class GlobalMembers
{
	public static char[][] map = new char[105][105];
	public static int Main()
	{
		int n;
		int m;
		int ans = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				map[i] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		m--;
		while (m-- != 0)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (map[i][j] == '$')
					{
						map[i][j] = '@';
					}
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (map[i][j] == '@')
					{
						if (i > 0 && map[i - 1][j] == '.')
						{
							map[i - 1][j] = '$';
						}
						if (i < n - 1 && map[i + 1][j] == '.')
						{
							map[i + 1][j] = '$';
						}
						if (j > 0 && map[i][j - 1] == '.')
						{
							map[i][j - 1] = '$';
						}
						if (j < n - 1 && map[i][j + 1] == '.')
						{
							map[i][j + 1] = '$';
						}
					}
				}
			}
		}
		ans = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				//printf("%c",map[i][j]);
				if (map[i][j] == '@' || map[i][j] == '$')
				{
					ans++;
				}
			}
		   // printf("\n");
		}
		System.out.printf("%d\n",ans);
		return 0;
	}

}

