package <missing>;

public class GlobalMembers
{
	/*
	 * cold.cpp
	 * ??:???m??????
	 *  Created on: 2013-1-13
	 *      Author: ???
	 */



	public static int m = 0;
	public static int n = 0;
	public static int sum = 0;
	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};

	public static void check()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '@')
				{
				for (k = 0;k < 4;k++)
				{
					if (i + dx[k] >= 0 && i + dx[k] < n && j + dy[k] >= 0 && j + dy[k] < n && room[i + dx[k]][j + dy[k]] == '.')
					{
						room[i + dx[k]][j + dy[k]] = ',';
					}
				}
				}
			}
		}
		return;
	}
	public static void change()
	{
		int i = 0;
		int j = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (room[i][j] == ',')
					{
						sum++;
						room[i][j] = '@';
					}
				}
			}
		return;
	}
	public static char[][] room = new char[200][200];

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (room[i][j] == '@')
				{
				sum++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < m;i++)
		{
			check();
			change();
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

