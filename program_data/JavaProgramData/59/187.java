package <missing>;

public class GlobalMembers
{
	public static char[][] room = new char[101][101];

	public static void get(int i, int j)
	{
		if (room[i - 1][j] == '.')
		{
			room[i - 1][j] = '*';
		}
		if (room[i + 1][j] == '.')
		{
			room[i + 1][j] = '*';
		}
		if (room[i][j - 1] == '.')
		{
			room[i][j - 1] = '*';
		}
		if (room[i][j + 1] == '.')
		{
			room[i][j + 1] = '*';
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		for (i = 0;i < n;i++)
		{
			room[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (k = 1;k < m;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (room[i][j] == '@')
					{
						get(i, j);
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (room[i][j] == '*')
					{
						room[i][j] = '@';
					}
				}
			}
		}

		int counter = 0;

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '@')
				{
					counter++;
				}
			}
		}

		System.out.print(counter);


		return 0;
	}


}

