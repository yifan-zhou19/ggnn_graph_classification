package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int time;
		int num;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (time = 1;time < m;time++)
		{


			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i - 1][j] != '#')
						{
							b[i - 1][j] = '@';
						}
						if (a[i + 1][j] != '#')
						{
							b[i + 1][j] = '@';
						}
						if (a[i][j - 1] != '#')
						{
							b[i][j - 1] = '@';
						}
						if (a[i][j + 1] != '#')
						{
							b[i][j + 1] = '@';
						}
						b[i][j] = '@';
					}
					if (a[i][j] == '#')
					{
						b[i][j] = '#';
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = b[i][j];
				}
			}

		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
				num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}



}

