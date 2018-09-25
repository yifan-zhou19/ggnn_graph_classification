package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] h = new int[20][20];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int[][] x = new int[400][2];
		int N = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((i == 0 || h[i][j] >= h[i - 1][j]) && (i == m - 1 || h[i][j] >= h[i + 1][j]) && (j == 0 || h[i][j] >= h[i][j - 1]) && (j == n - 1 || h[i][j] >= h[i][j + 1]))
				{
					x[N][1] = i;
					x[N][2] = j;
					N++;
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			System.out.printf("%d %d\n",x[i][1],x[i][2]);
		}
		return 0;
	}

}

