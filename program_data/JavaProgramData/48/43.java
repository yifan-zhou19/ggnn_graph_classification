package <missing>;

public class GlobalMembers
{
	public static int[][] A = new int[11][11];
	public static int[][] tmp = new int[11][11];
	public static int N;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A[5][5] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			N = Integer.parseInt(tempVar2);
		}
		for (int i = 0; i < N; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(tmp, 0, (Integer.SIZE / Byte.SIZE));
			for (int l = 1; l <= 9; l++)
			{
				for (int r = 1; r <= 9; r++)
				{
					tmp[l][r] += 2 * A[l][r];
					tmp[l - 1][r] += A[l][r];
					tmp[l + 1][r] += A[l][r];
					tmp[l][r - 1] += A[l][r];
					tmp[l][r + 1] += A[l][r];
					tmp[l - 1][r - 1] += A[l][r];
					tmp[l - 1][r + 1] += A[l][r];
					tmp[l + 1][r - 1] += A[l][r];
					tmp[l + 1][r + 1] += A[l][r];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(A, tmp, (Integer.SIZE / Byte.SIZE));
		}
		for (int i = 1; i < 10; i++)
		{
			for (int j = 1; j < 9; j++)
			{
				System.out.printf("%d ", A[i][j]);
			}
			System.out.printf("%d\n", A[i][9]);
		}
		return 0;
	}

}

