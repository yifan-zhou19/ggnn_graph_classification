package <missing>;

public class GlobalMembers
{
	public static int[][] mat = new int[120][120];

	public static int Main()
	{
		int n;
		int m;
		char buffer;
		int buffer2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				buffer = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (buffer == '.')
				{
				mat[i][j] = 1;
				}
				if (buffer == '#')
				{
				mat[i][j] = 0;
				}
				if (buffer == '@')
				{
				mat[i][j] = 2;
				}
			}
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int k = 1; k < m; k++)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (mat[i][j] == 2)
					{
						if (mat[i][j + 1] == 1)
						{
							mat[i][j + 1] = 3;
						}
						if (mat[i][j - 1] == 1)
						{
							mat[i][j - 1] = 3;
						}
						if (mat[i + 1][j] == 1)
						{
							mat[i + 1][j] = 3;
						}
						if (mat[i - 1][j] == 1)
						{
							mat[i - 1][j] = 3;
						}
					}
				}
			}

			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (mat[i][j] == 3)
					{
						mat[i][j] = 2;
					}
				}
			}

		}

		buffer2 = 0;

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (mat[i][j] == 2)
				{
					buffer2++;
				}
			}
		}

		System.out.print(buffer2);
		return 0;
	}
}

