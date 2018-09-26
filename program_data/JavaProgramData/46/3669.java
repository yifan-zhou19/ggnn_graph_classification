package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int M;
		int N;
		int i;
		int t;
		int e;
		int k;
		int[][] s = new int[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		t = M * N;
		e = 0;
		for (n = 0;n < N;n++)
		{
			for (m = 0;m < M;m++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[n][m] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < 103;k++)
		{
			for (i = k;i < M - k;i++)
			{
				System.out.printf("%d\n", s[k][i]);
				e++;
			}
			if (e == t)
			{
				break;
			}
			for (i = k + 1;i < N - k;i++)
			{
				System.out.printf("%d\n", s[i][M - k - 1]);
				e++;
			}
			if (e == t)
			{
				break;
			}
			for (i = M - k - 2;i > k - 1;i--)
			{
				System.out.printf("%d\n", s[N - k - 1][i]);
				e++;
			}
			if (e == t)
			{
				break;
			}
			for (i = N - k - 2;i > k;i--)
			{
				System.out.printf("%d\n", s[i][k]);
				e++;
			}
			if (e == t)
			{
				break;
			}
		}
		return 0;
	}

}

