import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???:flu.cpp
	 *??:???
	 *????: 2012-11-16
	 *??:???m???????
	 */



	public static int Main()
	{
		final int[] dx = {0, 0, 1, -1}; // ????
		final int[] dy = {1, -1, 0, 0};
		int i;
		int j;
		int x;
		int y;
		int k;
		int t;
		int n;
		int m;
		int ans = 0;
		char[][] room = new char[101][101]; // ??????
		char[][] temp = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		room[0] = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			room[i] = new Scanner(System.in).nextLine();
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '@')
				{
					ans++; // ????????
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			temp[i] = room[i];
		}
		for (t = 1;t < m;t++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (room[i][j] == '@') // ??
					{
						for (k = 0;k < 4;k++) // ??????
						{
							x = i + dx[k];
							y = j + dy[k];
							if (0 <= x != 0 && x < n && 0 <= y != 0 && y < n && temp[x][y] == '.') // ??????????
							{
								ans++; // ???+1
								temp[x][y] = '@'; // ????
							}
						}
					}
				}
			}
			for (i = 0;i < n;i++) // ????
			{
				room[i] = temp[i];
			}
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

