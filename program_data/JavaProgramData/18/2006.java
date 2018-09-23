package <missing>;

public class GlobalMembers
{
	public static int[][] mx = new int[200][200];
	public static int nn;
	public static int n;
	public static int ans;
	public static int Main()
	{
		nn = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int q = 1;q <= nn;q++)
		{
			ans = 0;
			n = nn;
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					mx[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (;n >= 2;n--)
			{
				int smin;
				for (int i = 1;i <= n;i++)
				{
					smin = mx[i][1];
					for (int j = 1;j <= n;j++)
					{
						smin = smin < mx[i][j] != 0?smin:mx[i][j];
					}
					for (int j = 1;j <= n;j++)
					{
						mx[i][j] -= smin;
					}
				}
				for (int i = 1;i <= n;i++)
				{
					smin = mx[1][i];
					for (int j = 1;j <= n;j++)
					{
						smin = smin < mx[j][i] != 0?smin:mx[j][i];
					}
					for (int j = 1;j <= n;j++)
					{
						mx[j][i] -= smin;
					}
				}
				ans += mx[2][2];
				for (int i = 1;i <= n;i++)
				{
					for (int j = 2;j < n;j++)
					{
						mx[i][j] = mx[i][j + 1];
					}
				}
				for (int i = 1;i <= n;i++)
				{
					for (int j = 2;j < n;j++)
					{
						mx[j][i] = mx[j + 1][i];
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

