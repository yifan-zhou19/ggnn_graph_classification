package <missing>;

public class GlobalMembers
{
	public static final int N = 9;

	public static int n;
	public static int m;
	public static int[][] a = new int[N + 1][N + 1];

	public static void dfs(int x, int y, int s, int d)
	{
		if (x < 1 || x> N || y < 0 || y> N)
		{
			return;
		}
		if (d == m)
		{
			a[x][y] += s;
			return;
		}
		dfs(x, y, s * 2, d + 1);
		for (int dx = -1;dx <= 1;dx++)
		{
			for (int dy = -1;dy <= 1;dy++)
			{
				if (dx != 0 || dy != 0)
				{
					dfs(x + dx, y + dy, s, d + 1);
				}
			}
		}
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		dfs(5, 5, n, 0);
		for (int i = 1;i <= N;i++)
		{
			for (int j = 1;j < N;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][N]);
		}

		return 0;
	}

}

