package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] mx = new int[200][200];
		int k;
		int m;
		int n;
		int ans = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int p = 1;p <= k;p++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= m;j++)
				{
					*(*(mx + i) + j) = ConsoleInput.readToWhiteSpace(true);
					if (i == 1 || i == n || j == 1 || j == m)
					{
						ans += *(*(mx + i) + j);
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
			ans = 0;
		}
	}
}

