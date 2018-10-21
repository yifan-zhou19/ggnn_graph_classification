package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int K;
		int M;
		int N;
		int[][] sz = new int[99][99];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			K = Integer.parseInt(tempVar);
		}
		for (int k = 1;k <= K;k++)
		{
			int result = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			for (int m = 0;m < M;m++)
			{
				for (int n = 0;n < N;n++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[m][n] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (M <= 2 || N <= 2)
			{
				for (int m = 0;m < M;m++)
				{
					for (int n = 0;n < N;n++)
					{
						result += sz[m][n];
					}
				}
			}
			else
			{
				for (int n = 0;n < N;n++)
				{
					result += sz[0][n];
				}
				for (int n = 0;n < N;n++)
				{
					result += sz[M - 1][n];
				}
				for (int m = 1;m < M - 1;m++)
				{
					result += sz[m][0];
				}
				for (int m = 1;m < M - 1;m++)
				{
					result += sz[m][N - 1];
				}
			}
			System.out.printf("%d\n",result);
		}
		return 0;
	}
}

