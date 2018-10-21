package <missing>;

public class GlobalMembers
{
	public static int[][] f = new int[30][30];
	public static int K(int m, int n)
	{
		if (f[m][n] != 0)
		{
			return f[m][n];
		}
		else if (m == 1 || n == 1)
		{
			f[m][n] = 1;
			return f[m][n];
		}
		else if (m < n)
		{
			f[m][n] = K(m, m);
			return f[m][n];
		}
		else if (m == n)
		{
			f[m][n] = K(m, m - 1) + 1;
			return f[m][n];
		}
		else
		{
			f[m][n] = K(m - n, n) + K(m, n - 1);
			return f[m][n];
		}
	}

	public static int Main()
	{
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	int M;
	int N;
	int k;
	for (int i = 0; i < t; i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			k = K(M, N);
			System.out.printf("%d\n", k);
	}
	return 0;
	}
}

