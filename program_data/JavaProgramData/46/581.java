package <missing>;

public class GlobalMembers
{
	public static void spread(int[][] A, int M, int N)
	{
		int i;
		int j = 0;
		int[] t = new int[400];
		if (M == 1 && N == 1)
		{
			System.out.printf("%d\n",A[0][0]);
		}
		else
		{
			if (M == 1)
			{
				for (i = 0;i < N;i++)
				{
				   t[j] = A[0][i];
				   j = j + 1;
				}
			}
				else if (N == 1)
				{
					for (i = 0;i < M;i++)
					{
						t[j] = A[i][0];
						 j = j + 1;
					}
				}
					else
					{
						for (i = 0;i < N - 1;i++)
						{
						   t[j] = A[0][i];
						   j = j + 1;
						}
						for (i = 0;i < M - 1;i++)
						{
						   t[j] = A[i][N - 1];
						   j = j + 1;
						}
						for (i = N - 1;i > 0;i--)
						{
						   t[j] = A[M - 1][i];
						   j = j + 1;
						}
						for (i = M - 1;i > 0;i--)
						{
						   t[j] = A[i][0];
						   j = j + 1;
						}
					}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d\n",t[i]);
		}
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int s;
		int r;
		int c;
		int k;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		k = r < c != 0?r:c;
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (i = 1;((r > 0) && (c > 0));i++)
			{
				spread(a, r, c);
				r = r - 2;
				c = c - 2;
				for (s = 0;s < r;s++)
				{
					for (j = 0;j < c;j++)
					{
						a[s][j] = a[s + 1][j + 1];
					}
				}
			}
	}
}

