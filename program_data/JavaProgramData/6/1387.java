package <missing>;

public class GlobalMembers
{
	public static int init()
	{
		//?????
		int k;
		int t;
		int m;
		int n;
		int ans;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k != 0)
		{
			k--;
			ans = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
					{
						ans += t;
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

	public static int Main()
	{
		init();
		return 0;
	}


}

