package <missing>;

public class GlobalMembers
{
	//*******************
	//**??????? **
	//**?????	   **
	//**???2013.11.3**
	//**????5.cpp  **
	//*******************
	public static int Main()
	{
		// ??cnt??????????day???????????
		int n;
		int i;
		int j;
		int m;
		int d;
		int cnt = 0;
		int[][] day = new int[102][102];
		char[][] a = new char[102][102]; // ?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					day[i][j] = 1; // ?day[i][j]???1
				}
			}
		}
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (d = 2; d <= m; d++)
			{
				for (i = 1; i <= n; i++)
				{
					for (j = 1; j <= n; j++)
					{
						// ???????????????????????
						if (a[i][j] == '@' && day[i][j] == d - 1)
						{
							day[i][j] = d;

							// ????????????????
							if (a[i][j - 1] == '.')
							{
								a[i][j - 1] = '@';
								day[i][j - 1] = d;
							}
							if (a[i - 1][j] == '.')
							{
								a[i - 1][j] = '@';
								day[i - 1][j] = d;
							}
							if (a[i][j + 1] == '.')
							{
								a[i][j + 1] = '@';
								day[i][j + 1] = d;
							}
							if (a[i + 1][j] == '.')
							{
								a[i + 1][j] = '@';
								day[i + 1][j] = d;
							}
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						cnt++; // ???????????
					}
				}
			}
			System.out.print(cnt);
			System.out.print("\n");
		return 0;
	}
}

