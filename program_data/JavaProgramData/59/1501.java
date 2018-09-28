package <missing>;

public class GlobalMembers
{
	//********************************
	//*????                     **
	//*????? 1300012848        **
	//*???2013.11.1              **
	//********************************
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[101][101];
		char[][] room = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int day = 1; day < m; day++)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (room[i][j] == '@' && a[i][j] == 0)
					{
						if (room[i + 1][j] == '.')
						{
							room[i + 1][j] = '@';
							a[i + 1][j] = 1;
						}
						if (room[i][j + 1] == '.')
						{
							room[i][j + 1] = '@';
							a[i][j + 1] = 1;
						}
						if (room[i - 1][j] == '.')
						{
							room[i - 1][j] = '@';
							a[i - 1][j] = 1;
						}
						if (room[i][j - 1] == '.')
						{
							room[i][j - 1] = '@';
							a[i][j - 1] = 1;
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
		}

		int cnt = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (room[i][j] == '@')
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

