package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int i;
		int j;
		int k;
		int r;
		int s;
		int t;
		int u;
		int xa;
		int ya;
		int xb;
		int yb;

		xa = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ya = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (r = 1; r <= xa; r++)
		{
			for (s = 1; s <= ya; s++)
			{
				a[r][s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		xb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1; t <= xb; t++)
		{
			for (u = 1; u <= yb; u++)
			{
				b[t][u] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 1; i <= xa; i++)
		{
			for (j = 1; j <= yb; j++)
			{
				c[i][j] = 0;
				for (k = 1; k <= xb; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
				if (j < yb)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				if (j == yb)
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}




}

