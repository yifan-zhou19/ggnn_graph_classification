package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int x1;
		int y1;
		int x2;
		int y2 = 0;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		int r;
		int s;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= x2;k++)
		{
			for (l = 1;l <= y2;l++)
			{
				b[k][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (m = 1;m <= x1;m++)
		{
			for (n = 1;n <= y2;n++)
			{
				for (p = 1;p <= y1;p++)
				{
					c[m][n] = c[m][n] + a[m][p] * b[p][n];
				}
			}
		}
		for (r = 1;r <= x1;r++)
		{
			for (s = 1;s < y2;s++)
			{
				System.out.print(c[r][s]);
				System.out.print(" ");
			}
			System.out.print(c[r][y2]);
			System.out.print("\n");
		}
		return 0;
	}
}

