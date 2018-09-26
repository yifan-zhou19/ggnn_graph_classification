package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int sum = 0;
		int[][] room = new int[102][102];
		char ch;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			System.in.read();
			for (j = 1; j <= n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					ch = tempVar2.charAt(0);
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
		int nn = n + 1;
		for (i = 0; i <= nn; i++)
		{
			room[i][0] = room[0][i] = room[i][nn] = room[nn][i] = -1;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 1; k < m; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
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
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
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

