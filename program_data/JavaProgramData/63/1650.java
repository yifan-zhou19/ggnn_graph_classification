package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[101][101];
		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x2;
		int y2;
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[101][101];
		for (int i = 1; i <= x2; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] c = new int[101][101];
		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				c[i][j] = 0;
				for (int k = 1; k <= y1; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				if (j == y2)
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

