package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] A = new int[9][9];
		int[][] B = new int[9][9];
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			(A[4][4]) = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (k = 0;k < n;k++)
		{
		for (i = 1;i < 8;i++)
		{
			for (j = 1;j < 8;j++)
			{
				B[i][j] = 2 * A[i][j] + A[i - 1][j - 1] + A[i - 1][j] + A[i - 1][j + 1] + A[i][j - 1] + A[i][j + 1] + A[i + 1][j - 1] + A[i + 1][j] + A[i + 1][j + 1];
			}
		}

		for (j = 1;j < 8;j++)
		{
			B[0][j] = 2 * A[0][j] + A[0][j - 1] + A[0][j + 1] + A[1][j] + A[1][j + 1] + A[1][j - 1];
		}

		for (j = 1;j < 8;j++)
		{
			B[8][j] = 2 * A[8][j] + A[8][j - 1] + A[8][j + 1] + A[7][j] + A[7][j + 1] + A[7][j - 1];
		}
		for (j = 1;j < 8;j++)
		{
			B[j][0] = 2 * A[j][0] + A[j - 1][0] + A[j - 1][1] + A[j][1] + A[j + 1][0] + A[j + 1][1];
		}
		for (j = 1;j < 8;j++)
		{
			B[j][8] = 2 * A[j][8] + A[j - 1][8] + A[j - 1][7] + A[j][7] + A[j + 1][7] + A[j + 1][8];
		}
		B[8][8] = 2 * A[8][8] + A[8][7] + A[7][8] + A[7][7];
		B[0][8] = 2 * A[0][8] + A[0][7] + A[1][8] + A[1][7];
		B[8][0] = 2 * A[8][0] + A[8][1] + A[7][0] + A[7][1];
		B[0][0] = 2 * A[0][0] + A[0][1] + A[1][0] + A[1][1];
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				A[i][j] = B[i][j];
			}
		}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
				System.out.printf("%d ",A[i][j]);
			}
			System.out.printf("%d\n",A[i][8]);
		}
	}

}

