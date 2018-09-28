package <missing>;

public class GlobalMembers
{
	/* ??5?????    */
	/* ??????       */
	/* ???1200012834   */

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int day;
		int total = 0;
		int[][] date = new int[103][103]; // date?????????????????
		char[][] room = new char[103][103];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			room[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1; i >= 0; i--)
		{
			for (j = n - 1; j >= 0; j--)
			{
				room[i + 1][j + 1] = room[i][j]; // ???????????????????�??�
			}
		}
		for (i = 0; i <= n + 1; i = i + n + 1)
		{
			for (j = 0; j <= n + 1; j++)
			{
				room[i][j] = '#';
				room[j][i] = '#'; // ??????�??�????"#"?????
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				date[i][j] = 1; // ?date???????????1
			}
		}
		for (day = 1; day < m; day++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (room[i][j] == '@' && date[i][j] == day) // ????date????day????
					{
																 // ?????????
						if (room[i + 1][j] == '.')
						{
							room[i + 1][j] = '@';
							date[i + 1][j] = day + 1; // ??????????date?????day+1?
													 // ??????????????????????
						}
						if (room[i - 1][j] == '.')
						{
							room[i - 1][j] = '@';
							date[i - 1][j] = day + 1;
						}
						if (room[i][j + 1] == '.')
						{
							room[i][j + 1] = '@';
							date[i][j + 1] = day + 1;
						}
						if (room[i][j - 1] == '.')
						{
							room[i][j - 1] = '@';
							date[i][j - 1] = day + 1;
						}
					}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (room[i][j] == '@')
				{
					total++;
				}
			}
		}
		System.out.print(total);
		System.out.print("\n");
		return 0;
	}

}

