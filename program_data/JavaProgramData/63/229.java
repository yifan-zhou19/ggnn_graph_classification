package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int h;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < x2; k++)
		{
			for (l = 0; l < y2; l++)
			{
				b[k][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (m = 0; m < x1; m++)
		{
			for (n = 0; n < y2; n++)
			{
				c[m][n] = 0;
				for (h = 0; h < y1; h++)
				{
					c[m][n] += a[m][h] * b[h][n];
				}
			}
		}
		for (i = 0; i < x1; i++)
		{
			System.out.print(c[i][0]);
			for (j = 1; j < y2; j++)
			{
				System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}






}

