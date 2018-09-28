package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= x1 - 1; i++)
		{
			for (int j = 0; j <= y1 - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0; k <= x2 - 1; k++)
		{
			for (int q = 0; q <= y2 - 1; q++)
			{
				b[k][q] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int w = 0; w <= x1 - 1; w++)
		{
			for (int e = 0; e <= y2 - 1; e++)
			{
				c[w][e] = 0;
				for (int r = 0; r <= y1 - 1; r++)
				{
					c[w][e] = c[w][e] + a[w][r] * b[r][e];
				}
				if (e == 0)
				{
					System.out.print(c[w][e]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(c[w][e]);
				}
				if (e == y2 - 1)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

