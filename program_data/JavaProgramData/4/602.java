package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; ///????
		int m;
		int[][] a = new int[1500][1500];
		int[] b = new int[10000];
		int i;
		int j;
		int sum;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 1499;i++)
		{
			for (j = 1;j <= 1499 ;j++)
			{
				a[i][j] = -198;
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			for (sum = 2;sum <= (n + m);sum++)
			{
				for (i = 1;i < sum;i++)
				{
					if (a[i][sum - i] != -198)
					{
						System.out.print(a[i][sum - i]);
						System.out.print("\n");
					}
				}
			}
			return 0;
	}
}

