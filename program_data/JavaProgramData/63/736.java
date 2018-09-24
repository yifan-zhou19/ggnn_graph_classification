package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int m = 0;
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				c[i][j] = a[i][j] - a[i][j];
				for (m = 0;m < y1;m++)
				{
					c[i][j] = c[i][j] + a[i][m] * b[m][j];
				}
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2 - 1;j++)
			{
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
			System.out.print(c[i][y2 - 1]);
			System.out.print("\n");
		}
	return 0;
	}
}

