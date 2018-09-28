package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] A = new int[10][10];
		int[][] B = new int[10][10];
		int i;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A[5][5] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		B[5][5] = A[5][5];
		for (k = 1;k <= m;k++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (A[i][j] != 0)
					{
						B[i - 1][j - 1] += A[i][j];
						B[i - 1][j] += A[i][j];
						B[i - 1][j + 1] += A[i][j];
						B[i][j - 1] += A[i][j];
						B[i][j] += A[i][j];
						B[i][j + 1] += A[i][j];
						B[i + 1][j - 1] += A[i][j];
						B[i + 1][j] += A[i][j];
						B[i + 1][j + 1] += A[i][j];
					}
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					A[i][j] = B[i][j];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			System.out.printf("%d",A[i][1]);
			for (j = 2;j <= 9;j++)
			{
				System.out.printf(" %d",A[i][j]);
			}
				System.out.print("\n");
		}

		return 0;
	}

}

