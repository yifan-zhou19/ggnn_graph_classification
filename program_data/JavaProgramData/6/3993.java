package <missing>;

public class GlobalMembers
{
	public static final int maxn = 110;
	public static int n;
	public static int m;
	public static int[][] d = new int[maxn][maxn];

	public static int Main()
	{
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t - .0.getValue() != 0)
		{
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < m; j++)
				{
					int tmp;
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						tmp = Integer.parseInt(tempVar4);
					}
					if (i == 0 || i == n - 1 || j == 0 || j == m - 1)
					{
						sum += tmp;
					}
				}
			}

			System.out.printf("%d\n", sum);
		}
	 return 0;
	}

}

