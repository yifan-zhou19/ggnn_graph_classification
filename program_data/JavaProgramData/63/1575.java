package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int c;
		int i;
		int j;
		int k;
		int l;
		int m;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1 * y1; i++)
		{
			a[i / y1][i % y1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < x2 * y2; j++)
		{
			b[j / y2][j % y2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 0; k < x1; k++)
		{
			for (l = 0; l < y2; l++)
			{
				c = 0;
				for (m = 0; m < y1; m++)
				{
					c += a[k][m] * b[m][l];
				}
				if (l != 0)
				{
					System.out.print(' ');
				}
				System.out.print(c);
				if (l == y2 - 1)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

