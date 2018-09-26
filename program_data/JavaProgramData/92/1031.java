package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int[][] array = new int[2][1001];
	public static int[][] benefit = new int[1001][1001];

	public static int Main()
	{
		int i;
		int j;
		int cnt = 0;
		while (scanf("%d",N) != EOF && N != 0)
		{
			++cnt;
			for (i = 0;i < N;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					array[0] + i = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < N;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					array[1] + i = Integer.parseInt(tempVar2);
				}
			}
			sort(array[0],array[0] + N);
			sort(array[1],array[1] + N);
			if (array[0][0] < array[1][N - 1])
			{
				benefit[1][0] = -200;
			}
			else if (array[0][0] > array[1][N - 1])
			{
				benefit[1][0] = 200;
			}
			else
			{
				benefit[1][0] = 0;
			}
			if (array[0][N - 1] < array[1][N - 1])
			{
				benefit[1][1] = -200;
			}
			else if (array[0][N - 1] > array[1][N - 1])
			{
				benefit[1][1] = 200;
			}
			else
			{
				benefit[1][1] = 0;
			}
			for (i = 2;i <= N;i++)
			{
				for (j = 0;j <= i;j++)
				{
					int tmp1 = -INF;
					int tmp2 = -INF;
					if (i > j)
					{
						tmp1 = benefit[i - 1][j];
						if (array[0][i - j - 1] > array[1][N - i])
						{
							tmp1 += 200;
						}
						else if (array[0][i - j - 1] < array[1][N - i])
						{
							tmp1 -= 200;
						}
					}
					if (j > 0)
					{
						tmp2 = benefit[i - 1][j - 1];
						if (array[0][N - j] > array[1][N - i])
						{
							tmp2 += 200;
						}
						else if (array[0][N - j] < array[1][N - i])
						{
							tmp2 -= 200;
						}
					}
					benefit[i][j] = tmp1;
					if (benefit[i][j] < tmp2)
					{
						benefit[i][j] = tmp2;
					}
				}
			}
			int m_benefit = -INF;
			for (j = 0;j <= N;j++)
			{
				if (m_benefit < benefit[N][j])
				{
					m_benefit = benefit[N][j];
				}
			}
			System.out.printf("%d\n",m_benefit);
		}
		return 0;
	}
}

