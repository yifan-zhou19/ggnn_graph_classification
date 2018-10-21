package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] map =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[][] flag = new int[102][102];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int counter = 0;

		for (int i = 0;i != n;i++)
		{
			for (int j = 0;j != n;j++)
			{
				map[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (map[i][j] == '@')
				{
					counter++;
					flag[i][j] = 1;
				}
			}
		}

		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int sum = 0;
		while (--m != 0)
		{
			for (int i = 0;i != n;i++)
			{
				for (int j = 0;j != n;j++)
				{
					if (map[i][j] == '@' && flag[i][j] == 1)
					{
						if (map[i + 1][j] == '.')
						{
							map[i + 1][j] = '@';
							sum++;
						}
						if (map[i][j + 1] == '.')
						{
							map[i][j + 1] = '@';
							sum++;
						}
						if (map[i - 1][j] == '.')
						{
							map[i - 1][j] = '@';
							sum++;
						}
						if (map[i][j - 1] == '.')
						{
							map[i][j - 1] = '@';
							sum++;
						}
					}
				}
			}
			for (int i = 0;i != n;i++)
			{
				for (int j = 0;j != n;j++)
				{
					if (map[i][j] == '@')
					{
						flag[i][j] = 1;
					}
				}
			}
		}
		System.out.print(sum + counter);
		System.out.print("\n");
		return 0;
	}
}

