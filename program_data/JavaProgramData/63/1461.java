package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//



	public static int Main()
	{
		int g = 0;
		int m;
		int sum = 0;
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y1 - 1;j++)
			{
				 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= x2 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				 b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (y2 != 1)
		{
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				c[i][j] = 0;
				for (m = 0;m <= x2 - 1;m++)
				{
					c[i][j] = c[i][j] + a[i][m] * b[m][j];
				}
				if (j == 0)
				{
					System.out.print(c[i][j]);
				}
				if (j != 0 && j != y2 - 1)
				{
					System.out.print(" ");
					System.out.print(c[i][j]);
				}
				if (j == y2 - 1 && y2 - 1 != 0)
				{
					System.out.print(" ");
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}
		}
		if (y2 == 1)
		{
			for (i = 0;i <= x1 - 1;i++)
			{
				c[i][0] = 0;
				for (m = 0;m <= x2 - 1;m++)
				{
					c[i][0] = c[i][0] + a[i][m] * b[m][0];
				}
				if (c[i][0] != 0)
				{
					g = 1;
				}
			}
		if (g == 1)
		{
			for (i = 0;i <= x1 - 1;i++)
			{
				System.out.print(c[i][0]);
				System.out.print("\n");
			}
		}
		if (g == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		}
		return 0;
	}
}

