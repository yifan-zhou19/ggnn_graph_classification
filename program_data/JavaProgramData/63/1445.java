package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] matrixA = new int[100][100];
		int[][] matrixB = new int[100][100];
		int[][] matrixC = new int[100][100];
		int i;
		int j;
		int x1;
		int y1;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				matrixA[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x2;
		int y2;
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
				matrixB[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i1 = 0; i1 < x1; i1++)
		{
			for (int j1 = 0; j1 < y2; j1++)
			{
				for (i = 0; i < x2; i++)
				{
					matrixC[i1][j1] = matrixC[i1][j1] + matrixA[i1][i] * matrixB[i][j1];
				}
			}
		}
		for (i = 0; i < x1; i++)
		{
			System.out.print(matrixC[i][0]);
			for (j = 1; j < y2; j++)
			{
				System.out.print(" ");
				System.out.print(matrixC[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

