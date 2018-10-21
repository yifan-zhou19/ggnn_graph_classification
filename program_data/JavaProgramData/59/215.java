package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int i1;
		int i2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][][] liu = new char[100][100][100];
		for (i = 0;i <= 99;i++)
		{
			for (j = 0;j <= 99;j++)
			{
				for (i1 = 0;i1 <= 99;i1++)
				{
					liu[i][j][i1] = ' ';
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				liu[1][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 0;j <= 99;j++)
			{
				for (i1 = 0;i1 <= 99;i1++)
				{
					liu[i + 1][j][i1] = liu[i][j][i1];
				}
			}
			for (i1 = 1;i1 <= n;i1++)
			{
				for (i2 = 1;i2 <= n;i2++)
				{
					if (liu[i][i1][i2] == '@')
					{
						if (liu[i][i1 - 1][i2] == '.')
						{
							liu[i + 1][i1 - 1][i2] = '@';
						}
						if (liu[i][i1 + 1][i2] == '.')
						{
							liu[i + 1][i1 + 1][i2] = '@';
						}
						if (liu[i][i1][i2 - 1] == '.')
						{
							liu[i + 1][i1][i2 - 1] = '@';
						}
						if (liu[i][i1][i2 + 1] == '.')
						{
							liu[i + 1][i1][i2 + 1] = '@';
						}
					}
				}
			}
		}
		int all = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (liu[m][i][j] == '@')
				{
					all++;
				}
			}
		}
		System.out.print(all);

		 return 0;
	}
}

