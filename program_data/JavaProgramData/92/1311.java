package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];
	public static int[][] f = new int[1001][1001];

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		while (N != 0)
		{
		 for (int i = 1; i <= N; i++)
		 {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
		 }
			for (int i = 1; i <= N; i++)
			{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
			}
		sort(a + 1, a + N + 1);
		sort(b + 1, b + N + 1);
		for (int i = 1; i <= N; i++)
		{
			for (int j = 1; j <= N; j++)
			{
				if (a[i] > b[j])
				{
					f[i][j] = f[i - 1][j - 1] + 1;
				}
				else if (a[i] < b[j])
				{
					f[i][j] = f[i][j - 1] - 1;
				}
				else
				{
					f[i][j] = Math.max(f[i - 1][j - 1], f[i][j - 1] - 1);
				}
			}
		}
		System.out.printf("%d\n", f[N][N] * 200);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			N = Integer.parseInt(tempVar4);
		}
		}
		return 0;
	}

}

