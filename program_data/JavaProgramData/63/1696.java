package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int i;
		int j;
		int m;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x2;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		} //C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ..... + A[i][q]*B[q][j]
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				c[i][j] = 0;
				for (m = 1;m <= y1;m++)
				{
					c[i][j] = a[i][m] * b[m][j] + c[i][j];
				}
			}
		} //???????????
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j < y2;j++)
			{
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
			System.out.print(c[i][y2]);
			System.out.print("\n");
		} //????c
		return 0;
	}
}

