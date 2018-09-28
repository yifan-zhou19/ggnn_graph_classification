package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < x2; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < y1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
				c[0][0] = 0;
		for (i = 0; i < x1; i++)
		{
			for (int j = 0; j < y2; j++)
			{
				for (int k = 0; k < x2; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (i = 0; i < x1; i++)
		{
				for (int j = 0; j < y2; j++)
				{
					if ((j + 1) % y2 != 0)
					{
					System.out.print(c[i][j]);
					System.out.print(' ');
					}
					else
					{
					System.out.print(c[i][j]);
					System.out.print("\n");
					}
				}
		}
		return 0;
	}

}

