public class pnt
{
	public int x;
	public int y;
	public int day;
}

package <missing>;

public class GlobalMembers
{
	public static final int[] move = {-1, 0, 1, 0, 0, -1, 0, 1};
	public static pnt[] st = tangible.Arrays.initializeWithDefaultpntInstances(100050);
	public static char[][] map = new char[128][128];
	public static int ans;
	public static int m;
	public static int n;
	public static int Main()
	{
		int i;
		int j;
		int l = 0;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar2 != null)
				{
					map[i][j] = tempVar2.charAt(0);
				}
				//printf("%c\n",map[i][j]); 
				if (map[i][j] == '@')
				{
					st[r].x = i;
					st[r].y = j;
					st[r].day = 1;
					r++;
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		ans = r;
		int xt;
		int yt;
		while (r > l)
		{
			for (i = 0;i < 4;i++)
			{
				xt = st[l].x + move[2 * i];
				yt = st[l].y + move[2 * i + 1];
				if (map[xt][yt] != '.')
				{
					continue;
				}
				ans++;
				map[xt][yt] = '@';
				if (st[l].day == m - 1)
				{
					continue;
				}
				st[r].x = xt;
				st[r].y = yt;
				st[r].day = st[l].day + 1;
				r++;
			}
			l++;
		}
		System.out.printf("%d\n",ans);
		return 0;
	}
}

