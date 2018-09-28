package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int day;
		char[][] array = new char[100][100];
		char[][] temp = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				array[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int d = 1;d < day;d++)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					temp[i][j] = array[i][j];
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (temp[i][j] == '@')
					{
						if (i > 0 && temp[i - 1][j] == '.')
						{
							array[i - 1][j] = '@';
						}
						if (i < n - 1 && temp[i + 1][j] == '.')
						{
							array[i + 1][j] = '@';
						}
						if (j > 0 && temp[i][j - 1] == '.')
						{
							array[i][j - 1] = '@';
						}
						if (j < n - 1 && temp[i][j + 1] == '.')
						{
							array[i][j + 1] = '@';
						}
					}
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

