package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		char[][] array = new char[200][200];
		char[][] temp = new char[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				array[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				temp[i][j] = array[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int day = 0;day < m - 1;day++)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (temp[i][j] == '@')
					{
						if (j < n - 1 && array[i][j + 1] != '#')
						{
							array[i][j + 1] = '@';
						}
						if (j > 0 && array[i][j - 1] != '#')
						{
							array[i][j - 1] = '@';
						}
						if (i < n - 1 && array[i + 1][j] != '#')
						{
							array[i + 1][j] = '@';
						}
						if (i > 0 && array[i - 1][j] != '#')
						{
							array[i - 1][j] = '@';
						}
					}
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					temp[i][j] = array[i][j];
				}
			}
		}
		int sum = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (array[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

