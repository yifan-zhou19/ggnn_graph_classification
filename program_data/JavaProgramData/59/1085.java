package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] day = new int[103][103];
		int k;
		char[][] room = new char[103][103];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(room, '#', 103 * 103 * (Character.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (room[i][j] == '@')
				{
					day[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2; k <= m; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (room[i][j] == '@' && day[i][j] == k - 1)
					{
						if (room[i - 1][j] == '.')
						{
							room[i - 1][j] = '@';
							day[i - 1][j] = k;
						}
						if (room[i + 1][j] == '.')
						{
							room[i + 1][j] = '@';
							day[i + 1][j] = k;
						}
						if (room[i][j + 1] == '.')
						{
							room[i][j + 1] = '@';
							day[i][j + 1] = k;
						}
						if (room[i][j - 1] == '.')
						{
							room[i][j - 1] = '@';
							day[i][j - 1] = k;
						}
					}
				}
			}
		}
		int count = 0;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (room[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		return 0;
	}
}

