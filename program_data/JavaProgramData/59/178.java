public class ro
{
public int x;
public int y;
public int s;
}

package <missing>;

public class GlobalMembers
{
	public static ro[] room = tangible.Arrays.initializeWithDefaultroInstances(11111);
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[][] a = new int[101][101];
		int t = 0;
		int day = 1;
		int cu = 0;
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c[i][j] == '#')
				{
					a[i][j] = 9999;
				}
				if (c[i][j] == '@')
				{
					a[i][j] = 1;
					room[t].s = 0;
					room[t].x = i;
					room[t].y = j;
					t++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (t == 0)
		{

			System.out.print(0);
			return 0;
		}
		while (true)
		{
			if (c[room[cu].x + 1][room[cu].y] == '.' && a[room[cu].x + 1][room[cu].y] == 0)
			{
				room[t].s = room[cu].s + 1;
				a[room[cu].x + 1][room[cu].y] = room[t].s;
				room[t].x = room[cu].x + 1;
				room[t].y = room[cu].y;
				t++;
			}
			if (c[room[cu].x - 1][room[cu].y] == '.' && a[room[cu].x - 1][room[cu].y] == 0)
			{
				room[t].s = room[cu].s + 1;
				a[room[cu].x - 1][room[cu].y] = room[t].s;
				room[t].x = room[cu].x - 1;
				room[t].y = room[cu].y;
				t++;
			}
			if (c[room[cu].x][room[cu].y + 1] == '.' && a[room[cu].x][room[cu].y + 1] == 0)
			{
				room[t].s = room[cu].s + 1;
				a[room[cu].x][room[cu].y + 1] = room[t].s;
				room[t].x = room[cu].x;
				room[t].y = room[cu].y + 1;
				t++;
			}
			if (c[room[cu].x][room[cu].y - 1] == '.' && a[room[cu].x][room[cu].y - 1] == 0)
			{
				room[t].s = room[cu].s + 1;
				a[room[cu].x][room[cu].y - 1] = room[t].s;
				room[t].x = room[cu].x;
				room[t].y = room[cu].y - 1;
				t++;
			}
			if (room[cu].s > m)
			{
				break;
			}
			if (cu > 9999)
			{
				break;
			}
			cu++;
		}
		int sum = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] >= 1 && a[i][j] < m)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

