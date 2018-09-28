package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] map =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int days;
		int i;
		int j;
		int[][] flag = new int[102][102];
		int[][] flaggy = new int[102][102];
		int k = 1;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				map[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (map[i][j] == '@')
				{
					flag[i][j] = 1;
					flaggy[i][j] = 1;
				}
			}
		}
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k < days)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (flag[i][j] == 1)
					{
						if (map[i - 1][j] == '.')
						{
							flaggy[i - 1][j] = 1;
						}
						if (map[i + 1][j] == '.')
						{
							flaggy[i + 1][j] = 1;
						}
						if (map[i][j - 1] == '.')
						{
							flaggy[i][j - 1] = 1;
						}
						if (map[i][j + 1] == '.')
						{
							flaggy[i][j + 1] = 1;
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					flag[i][j] = flaggy[i][j];
				}
			}
			k++;
		}
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
					if (flag[i][j] == 1)
					{
						count++;
					}
				}
		}
		System.out.print(count);
		System.out.print("\n");


		return 0;
	}


}

