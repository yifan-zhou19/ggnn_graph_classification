package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int l;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < x2;k++)
		{
			for (l = 0;l < y2;l++)
			{
				b[k][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x;
		int y;
		int z;
		for (x = 0;x < x1;x++)
		{
			for (y = 0;y < y2;y++)
			{
				c[x][y] = 0;
				for (z = 0;z < y1;z++)
				{
					c[x][y] += a[x][z] * b[z][y];
				}
			}
		}
		int m;
		int n;
		for (m = 0;m < x1;m++)
		{
			for (n = 0;n < y2 - 1;n++)
			{
				System.out.print(c[m][n]);
				System.out.print(" ");
			}
			System.out.print(c[m][y2 - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

