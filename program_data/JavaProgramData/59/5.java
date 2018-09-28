package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int sum = 0;
		int[][] room = new int[102][102];
		char ch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
			for (int j = 1; j <= n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					ch = tempVar3.charAt(0);
				}
				if (ch == '#')
				{
					room[i][j] = -1;
				}
				else if (ch == '.')
				{
					room[i][j] = 0;
				}
				else if (ch == '@')
				{
					room[i][j] = 1;
				}
			}
		}

		for (int i = 0; i <= n + 1; i++)
		{
			room[i][0] = room[0][i] = room[i][n + 1] = room[n + 1][i] = -1;
		}

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}

		for (int k = 1; k < m; k++)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (room[i][j] == k)
					{
						if (room[i + 1][j] == 0)
						{
							room[i + 1][j] = k + 1;
						}
						if (room[i - 1][j] == 0)
						{
							room[i - 1][j] = k + 1;
						}
						if (room[i][j + 1] == 0)
						{
							room[i][j + 1] = k + 1;
						}
						if (room[i][j - 1] == 0)
						{
							room[i][j - 1] = k + 1;
						}
					}
				}
			}
		}
		sum = 0;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (room[i][j] > 0)
				{
					sum++;
				}
			}
		}
		System.out.printf("%d\n", sum);

		return 0;
	}

}

