package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0; //???k??????????m????n?m<100?n<100?
		int m = 0;
		int n = 0;
		int ans = 0;
		int a = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0; j < m; j++) //???
			{
				for (int l = 0; l < n; l++)
				{
					a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (l == 0 || l == (n - 1))
					{
						ans += a;
					}
					else if (j == 0 || j == (m - 1))
					{
						ans += a;
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
			ans = 0;
		}
		return 0;
	}
}

