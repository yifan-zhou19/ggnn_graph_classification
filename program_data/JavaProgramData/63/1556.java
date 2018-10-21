package <missing>;

public class GlobalMembers
{
	/*???????
	  ??????1200012829
	  ???2012-11-10 0:04:13*/
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int k;
		int l;
		int[][] c =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int m;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= x1 - 1; i++)
		{
			for (j = 0; j <= y1 - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k <= x2 - 1; k++)
		{
			for (l = 0; l <= y2 - 1; l++)
			{
				b[k][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= x1 - 1; i++)
		{
			for (j = 0; j <= y2 - 1; j++)
			{
				for (m = 0; m <= y1 - 1; m++)
				{
					c[i][j] = c[i][j] + a[i][m] * b[m][j];
				}
				if (j == y2 - 1 && i != x1 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
				else if (j != y2 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print(' ');
				}
				else
				{
					System.out.print(c[i][j]);
				}
			}
		}
		return 0;
	}
}

