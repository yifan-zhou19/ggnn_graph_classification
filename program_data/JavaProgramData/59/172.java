package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		char[][] pep = new char[101][101];
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				pep[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int day;
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m;
		for (m = 2; m <= day; m++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (pep[i][j] == '@')
					{
						if (pep[i][j + 1] == '.' && (j + 1) < n)
						{
							pep[i][j + 1] = 'a';
						}
						if (pep[i + 1][j] == '.' && (i + 1) < n)
						{
							pep[i + 1][j] = 'a';
						}
						if (pep[i - 1][j] == '.' && (i - 1) >= 0)
						{
							pep[i - 1][j] = 'a';
						}
						if (pep[i][j - 1] == '.' && (j - 1) >= 0)
						{
							pep[i][j - 1] = 'a';
						}
					}
				}
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (pep[i][j] == 'a')
					{
						pep[i][j] = '@';
					}
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (pep[i][j] == '@')
				{
					num++;
				}
			}
		}

			System.out.print(num);


		return 0;
	}



}

