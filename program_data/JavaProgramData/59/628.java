import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ???:p5.cpp
	 * ??:???
	 * ??:1200012749
	 * ????:2012-11-11
	 * ??:???m???????
	 */



	public static int Main()
	{
		final int[] dirx = {0, 0, 1, -1};
		final int[] diry = {1, -1, 0, 0};
		int n; // ans??????
		int m;
		int i;
		int j;
		int k;
		int x;
		int y;
		int mtime;
		int ans = 0;
		char[][] room = new char[200][200]; // room???????newroom??????
		char[][] newroom = new char[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		room[0] = new Scanner(System.in).nextLine(); // ????
		for (i = 0;i < n;i++)
		{
			room[i] = new Scanner(System.in).nextLine(); // ????
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (mtime = 1;mtime < m;mtime++) // ????
		{
			for (i = 0;i < n;i++) // ??????
			{
				for (j = 0;j < n;j++)
				{
					newroom[i][j] = room[i][j];
				}
			}
			for (i = 0;i < n;i++) // ????????
			{
				for (j = 0;j < n;j++)
				{
					if (room[i][j] == '@')
					{
						for (k = 0;k < 4;k++) // ??????
						{
							x = i + dirx[k];
							y = j + diry[k];
							if (0 <= x != 0 && x < n && 0 <= y != 0 && y < n && room[x][y] == '.')
							{
								// ???????????
								newroom[x][y] = '@'; // ??
							}
						}
					}
				}
			}
			for (i = 0;i < n;i++) // ??????
			{
				for (j = 0;j < n;j++)
				{
					room[i][j] = newroom[i][j];
				}
			}
		}
		for (i = 0;i < n;i++) // ?????
		{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '@')
				{
					ans++;
				}
			}
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

