package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] map = new char[100][100];
		int[][] number = new int[101][101];
		int[][] temp = new int[101][101];
		int n;
		int i;
		int j;
		int t;
		int m;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			map[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (map[i][j] == '@')
				{
					number[i + 1][j + 1] = 1;
				}
				if (map[i][j] == '.')
				{
					number[i + 1][j + 1] = 0;
				}
				if (map[i][j] == '#')
				{
					number[i + 1][j + 1] = -1;
				}
			}
		}
		for (t = 0;t < m - 1;t++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					temp[i][j] = number[i][j];
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (temp[i][j] == 1)
					{
						if (temp[i + 1][j] == 0)
						{
							number[i + 1][j] = 1;
						}
						if (temp[i - 1][j] == 0)
						{
							number[i - 1][j] = 1;
						}
						if (temp[i][j + 1] == 0)
						{
							number[i][j + 1] = 1;
						}
						if (temp[i][j - 1] == 0)
						{
							number[i][j - 1] = 1;
						}
					}

				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (number[i][j] == 1)
				{
					count++;
				}
			}
		}
		System.out.print(count);
		return 0;
	}
}

