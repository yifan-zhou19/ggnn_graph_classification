package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[m][m];
	public static int[][] b = new int[m][m];
	public static int[][] c = new int[m][m];

	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= x2; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				int t = 0;
				for (int k = 1; k <= y1; k++)
				{
					t += a[i][k] * b[k][j];
				}
				c[i][j] = t;
			}
		}

		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				if (j != 1)
				{
					System.out.print(' ');
				}
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

