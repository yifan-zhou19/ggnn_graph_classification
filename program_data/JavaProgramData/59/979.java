package <missing>;

public class GlobalMembers
{
	public static char[][] p = new char[100][100];
	public static int[][] state = new int[100][100];
	public static int n;
	public static int m;
	public static int num = 0;

	public static void spread(int x, int y, int k)
	{
		 if (x < 0 || x == n || y < 0 || y == n)
		 {
			 return;
		 }
		 if (p[x][y] == '@' || p[x][y] == '#')
		 {
			 return;
		 }
		 if (p[x][y] == '.')
		 {
			 p[x][y] = '@';
			 num++;
			 state[x][y] = k + 1;
		 }
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				p[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (p[i][j] == '@')
				{
					num++;
					state[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (p[i][j] == '@' && state[i][j] == k)
					{
						spread(i - 1, j, k);
						spread(i + 1, j, k);
						spread(i, j - 1, k);
						spread(i, j + 1, k);
					}
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

