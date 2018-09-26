package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] room = new int[101][101];
		int[][] temp = new int[101][101];
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		int sum = 0;
		char a = '0';
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (a)
				{
				case '.':
					room[i][j] = 0;
					break;
				case '#':
					room[i][j] = -1;
					break;
				case '@':
					room[i][j] = 1;
					break;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
					for (j = 1;j <= n;j++)
					{
						if (room[i][j] == k)
						{
							if (room[i - 1][j] == 0)
							{
								room[i - 1][j] = k + 1;
							}
							if (room[i][j - 1] == 0)
							{
								room[i][j - 1] = k + 1;
							}
							if (room[i + 1][j] == 0)
							{
								room[i + 1][j] = k + 1;
							}
							if (room[i][j + 1] == 0)
							{
								room[i][j + 1] = k + 1;
							}
						}
					}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (room[i][j] > 0)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

