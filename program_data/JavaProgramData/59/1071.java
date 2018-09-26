package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int tot = 0;
		int i;
		int j;
		int k;
		char[][] map = new char[200][200];
		char[][] map_temp = new char[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; ++i)
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

		for (k = 1; k < m; ++k)
		{
			for (i = 0; i < n; ++i)
			{
				map_temp[i] = map[i];
			}
			for (i = 0; i < n; ++i)
			{
				for (j = 0; j < n; ++j)
				{
					if (map_temp[i][j] == '@')
					{
					   if (i > 0 && map[i - 1][j] == '.')
					   {
						  map[i - 1][j] = '@';
					   }
					   if (i + 1 < n && map[i + 1][j] == '.')
					   {
						  map[i + 1][j] = '@';
					   }
					   if (j > 0 && map[i][j - 1] == '.')
					   {
						  map[i][j - 1] = '@';
					   }
					   if (j + 1 < n && map[i][j + 1] == '.')
					   {
						  map[i][j + 1] = '@';
					   }
					}
				}
			}
		}

		for (i = 0; i < n; ++i)
		{
			for (j = 0; j < n; ++j)
			{
				if (map[i][j] == '@')
				{
				   ++tot;
				}
			}
		}

		System.out.printf("%d\n", tot);
		return 0;
	}

}

