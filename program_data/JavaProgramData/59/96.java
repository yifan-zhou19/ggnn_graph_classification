package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int ans = 0;
		int[] qx = new int[10002];
		int[] qy = new int[10002];
		int h = 0;
		int t = 0;
		int tt = 0;
		char[][] map = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				map[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (map[i][j] == '@')
				{
					ans++;
					qx[t] = i;
					qy[t++] = j;
					tt++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m - 1;i++)
		{
			for (j = h;j < t;j++)
			{
				if (map[qx[j] + 1][qy[j]] == '.')
				{
					map[qx[j] + 1][qy[j]] = '@';
					ans++;
					qx[tt] = qx[j] + 1;
					qy[tt] = qy[j];
					tt++;
				}
				if (map[qx[j] - 1][qy[j]] == '.')
				{
					map[qx[j] - 1][qy[j]] = '@';
					ans++;
					qx[tt] = qx[j] - 1;
					qy[tt] = qy[j];
					tt++;
				}
				if (map[qx[j]][qy[j] + 1] == '.')
				{
					map[qx[j]][qy[j] + 1] = '@';
					ans++;
					qx[tt] = qx[j];
					qy[tt] = qy[j] + 1;
					tt++;
				}
				if (map[qx[j]][qy[j] - 1] == '.')
				{
					map[qx[j]][qy[j] - 1] = '@';
					ans++;
					qx[tt] = qx[j];
					qy[tt] = qy[j] - 1;
					tt++;
				}
			}
			h = t;
			t = tt;
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}

}

