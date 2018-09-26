package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static char[][] r = new char[100][100];
	public static void check(int x,int y,int z)
	{
		if (a[x][y] == -1 && r[x][y] != '#')
		{
			a[x][y] = z;
			r[x][y] = '@';
		}
		return;
	}
	public static int Main()
	{
		for (int i = 0;i < 100;i++)
		{
			for (int j = 0;j < 100;j++)
			{
				a[i][j] = -1;
			}
		}
		int n;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				r[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (r[i][j] == '@')
				{
					a[i][j] = 1;
				}
			}
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < d;k++)
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i][j] <= k != 0 && a[i][j] >= 0)
					{
						check(i - 1, j, k + 1);
						check(i + 1, j, k + 1);
						check(i, j + 1, k + 1);
						check(i, j - 1, k + 1);
					}
				}
			}
		}
		int num = 0;
			for (int i = 1;i <= n;i++)
			{
			for (int j = 1;j <= n;j++)
			{
				if (a[i][j] >= 0)
				{
					num++;
				}
			}
			}
		System.out.print(num);
		return 0;
	}

}

