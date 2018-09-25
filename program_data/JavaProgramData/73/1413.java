package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[N][M];
		int i;
		int j;
		int k;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < M;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			j = 0;
			for (k = 0;k < M;k++)
			{
				if (a[i][k] > a[i][j])
				{
					j = k;
				}
			}
			for (k = 0;k < N;k++)
			{
				if (a[k][j] < a[i][j])
				{
					break;
				}
			}
			if (k == N)
			{
				System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
				return 0;
			}
		}
		System.out.print("not found\n");
		return 0;
	}
}

