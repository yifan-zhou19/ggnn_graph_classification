package <missing>;

public class GlobalMembers
{
	//********************************
	//*???5.cpp   **
	//*???????    **
	//*?????? 1300012838 **
	//*???2013.11.1  **
	//********************************

	public static int Main()
	{
		int n;
		int m;
		int cnt = 0;
		int flag = 0;
		char[][][] room = new char[102][102][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				room[i][j][0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int day = 1; day < m; day++)
		{
			flag = 1 - flag;
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (room[i][j][1 - flag] != '#')
					{
						if (room[i - 1][j][1 - flag] == '@' || room[i + 1][j][1 - flag] == '@' || room[i][j - 1][1 - flag] == '@' || room[i][j + 1][1 - flag] == '@')
						{
							room[i][j][flag] = '@';
						}
						else
						{
							room[i][j][flag] = room[i][j][1 - flag];
						}
					}
					else
					{
						room[i][j][flag] = '#';
					}
				}
			}

		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (room[i][j][flag] == '@')
				{
					cnt++;
				}
			}
		}
		System.out.print(cnt);
		System.out.print("\n");



		return 0;
	}
}

