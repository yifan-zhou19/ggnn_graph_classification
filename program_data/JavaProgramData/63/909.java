package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int k;
		int arow;
		int acol;
		int brow;
		int bcol;
		arow = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		acol = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < arow * acol; i++)
		{
			a[i / acol][i % acol] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		brow = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bcol = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < brow * bcol; i++)
		{
			b[i / bcol][i % bcol] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < arow; i++)
		{
			for (j = 0; j < bcol; j++)
			{
				for (k = 0; k < acol; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]);
				if (j == bcol - 1)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		return 0;
	}



}

