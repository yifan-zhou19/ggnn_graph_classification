package <missing>;

public class GlobalMembers
{
	//*************************
	//*??????  1200062705
	//*????4.????
	//*???2012-11-11
	//*************************
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int m;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x1; i++) // ??????
		{
			for (j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= x1; i++) // ????????
		{
			for (j = 1; j <= y2; j++)
			{
				for (m = 1; m <= y1; m++)
				{
					{
						c[i][j] = c[i][j] + a[i][m] * b[m][j]; // ????
				}
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

