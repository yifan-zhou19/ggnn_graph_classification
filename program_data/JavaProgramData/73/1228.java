package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] c = new int[M][N];
		int[] max = new int[M];
		int[] min = new int[N];
		int a;
		int b;
		int m;
		int n;
		for (a = 0;a < M;a++)
		{
			for (b = 0;b < N;b++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(c[a][b]) = Integer.parseInt(tempVar);
				}
			}
		}
		for (m = 0;m < M;m++)
		{
			max[m] = c[m][0];
		}
		for (n = 0;n < N;n++)
		{
			min[n] = c[0][n];
		}
		int i;
		int j;
		for (i = 0;i < M;i++)
		{
			for (j = 0;j < N;j++)
			{
				if (max[i] < c[i][j])
				{
					max[i] = c[i][j];
				}
				if (min[j] > c[i][j])
				{
					min[j] = c[i][j];
				}
			}
		}
		int p;
		int q;
		int k = 0;
		for (p = 0;p < M;p++)
		{
			for (q = 0;q < N;q++)
			{
				if (max[p] == min[q])
				{
					System.out.printf("%d %d %d",p + 1,q + 1,max[p]);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found\n");
		}
		return 0;
	}

}

