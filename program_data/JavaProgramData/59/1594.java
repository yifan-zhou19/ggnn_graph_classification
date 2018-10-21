package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1300012713 **
	//*???2013.11.04  **
	//********************************
	public static int Main()
	{
		char[][] a = new char[100][100]; //??????a
		int m; //?????
		int n;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++) //??????
		{
			for (int j = 1; j <= n; j++)
			{
				a[i - 1][j - 1] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1; k <= m - 1; k++) //?????? ??????
		{
			for (int x = 0; x < n; x++)
			{
				for (int y = 0; y < n; y++)
				{
					if (a[x][y] == '@') //??????
					{
						if (a[x - 1][y] == '.' && x != 0) //??????????
						{
							a[x - 1][y] = '!';
						}
						if (a[x + 1][y] == '.' && x != n - 1)
						{
							a[x + 1][y] = '!';
						}
						if (a[x][y - 1] == '.' && y != 0)
						{
							a[x][y - 1] = '!';
						}
						if (a[x][y + 1] == '.' && y != n - 1)
						{
							a[x][y + 1] = '!';
						}
					}
				}
			}
			for (int z = 1; z <= n; z++)
			{
				for (int t = 1; t <= n; t++)
				{
					if (a[z - 1][t - 1] == '!') //???????????
					{
						a[z - 1][t - 1] = '@';
					}
				}
			}

		}

		for (int p = 1; p <= n; p++)
		{
			for (int q = 1; q <= n; q++)
			{
				if (a[p - 1][q - 1] == '@')
				{
					num = num + 1; //???????
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

