package <missing>;

public class GlobalMembers
{
	public static final int N = 5;

	public static int max(int[] a)
	{
		int i;
		int m = 0;
		for (i = 1;i < N;i++)
		{
			if (a[i] > a[m])
			{
				m = i;
			}
		}
		return m;
	}

	public static int min(int[][] a, int m, int n)
	{
		int i;
		for (i = 0;i < N;i++)
		{
			if (a[i][n] < a[m][n])
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int[][] a = new int[N][N];
		int i;
		int j;
		int n;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			n = max(a[i]);
			if (min(a, i, n) != 0)
			{
				System.out.printf("%d %d %d",i + 1,n + 1,a[i][n]);
				return 0;
			}
		}
		System.out.print("not found");
	}
}

