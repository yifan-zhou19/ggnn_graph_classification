package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int o;
		int p;
		int q;
		int[][] A = new int[100][100];
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			A[0][i] = 255;
			A[i][0] = 255;
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					A[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}


		for (i = 0;i <= n + 1;i++)
		{
			A[n + 1][i] = 255;
			A[i][n + 1] = 255;
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (A[i - 1][j] == 255 && A[i][j - 1] == 255 && A[i + 1][j] == 0 && A[i][j + 1] == 0 && A[i][j] == 0)
				{
					m = i;
					o = j;
				}
				if (A[i - 1][j] == 0 && A[i][j - 1] == 0 && A[i + 1][j] == 255 && A[i][j + 1] == 255 && A[i][j] == 0)
				{
					p = i;
					q = j;
				}

			}
		}
		s = (p - m - 1) * (q - o - 1);
		System.out.printf("%d",s);
		return 0;
	}


}

