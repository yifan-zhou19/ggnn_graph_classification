package <missing>;

public class GlobalMembers
{
	public static int[][] h = new int[25][25];
	public static int f(int x, int y)
	{
		if (h[x][y] >= h[x - 1][y] != 0 && h[x][y] >= h[x + 1][y] != 0 && h[x][y] >= h[x][y - 1] != 0 && h[x][y] >= h[x][y + 1])
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (f(i, j) != 0)
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

