package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int tx;
		int ty;
		char[][] a = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] quex = new int[100 * 100];
		int[] quey = new int[100 * 100];
		int l = 0;
		int r = 0;
		int day = 1;
		int tempr;
		int[][] vs = new int[100][100];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					quex[r] = i;
					quey[r] = j;
					r++;
					vs[i][j] = 1;
				}
			}
		}
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] dx = new int[4];
			int[] dy = new int[4];
			dx[0] = -1;
			dx[1] = 1;
			dx[2] = 0;
			dx[3] = 0;
			dy[0] = 0;
			dy[1] = 0;
			dy[2] = 1;
			dy[3] = -1;
			tempr = r;

			while ((l != r) && (day < m))
			{
				day++;
				for (i = l;i < tempr;i++)
				{
					tx = quex[i];
					ty = quey[i];
					l++;
					for (j = 0;j < 4;j++)
					{
						if ((tx + dx[j] >= 0) && (tx + dx[j] < n) && (ty + dy[j] >= 0) && (ty + dy[j] < n))
						{
							if ((a[tx + dx[j]][ty + dy[j]] == '.') && (vs[tx + dx[j]][ty + dy[j]] == 0))
							{
								quex[r] = tx + dx[j];
								quey[r] = ty + dy[j];
								r++;
								vs[tx + dx[j]][ty + dy[j]] = 1;
							}
						}
					}
				}
				tempr = r;
			}
			System.out.print(r);
			return 0;
	}

}

