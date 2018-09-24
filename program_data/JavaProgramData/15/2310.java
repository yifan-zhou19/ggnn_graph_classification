package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1100][1100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int ans = 0;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (a[i][j] == 0)
				{
					continue;
				}
				else
				{
					int f = 0;
					for (int k = i + 1;k <= n;k++)
					{
						if (a[k][j] == 0 && a[k][j + 1] == 0)
						{
						f++;
						}
					}
					if (f % 2 == 1)
					{
						ans++;
					}
				}
			}
		}
		System.out.print(ans);
		return 0;
	}

}

