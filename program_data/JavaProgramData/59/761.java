package <missing>;

public class GlobalMembers
{
	//********************************
	//********************************
	//***?????? 1200012776
	//***??: ????
	//***??: 2012?11?11?
	//********************************
	//********************************
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int sick = 0;
		char[][] room =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] room_before = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				room_before[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++) //k??????????
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					room[i][j] = room_before[i][j];
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (room_before[i][j] == '@') //?????????
					{
						if (room_before[i - 1][j] == '.') //?????????????
						{
							room[i - 1][j] = '@';
						}
						if (room_before[i + 1][j] == '.') //?????????????
						{
							room[i + 1][j] = '@';
						}
						if (room_before[i][j - 1] == '.') //?????????????
						{
							room[i][j - 1] = '@';
						}
						if (room_before[i][j + 1] == '.') //?????????????
						{
							room[i][j + 1] = '@';
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					room_before[i][j] = room[i][j];
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (room[i][j] == '@')
				{
					sick++;
				}
			}
		}
		System.out.print(sick);
		System.out.print("\n");
		return 0;
	}
}

