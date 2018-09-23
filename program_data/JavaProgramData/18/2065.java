package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int s;
	public static int[][] a = new int[101][101];
	public static void guiling(int i,int j,int x,int y)
	{
		if (i == m || j == m)
		{
			return;
		}
		if (a[i][j] < s)
		{
			s = a[i][j];
		}
		guiling(i + x, j + y, x, y);
		a[i][j] -= s;
	}
	public static void xiaojian()
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < m;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < m;j++)
			{
				a[j][i] = a[j + 1][i];
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n;
		while (l > 0)
		{
			for (i = 0;i < n;i++)
			{
					for (j = 0;j < n;j++)
					{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
			}
			int sum = 0;
			for (m = n;m > 0;m--)
			{
				for (i = 0;i < 2 * m;i++)
				{
					if (i < m)
					{
						s = 1000;
					guiling(i, 0, 0, 1);
					}
					else
					{
						s = 1000;
					guiling(0, i - m, 1, 0);
					}
				}
				 sum += a[1][1];
				 xiaojian();
			}
			System.out.print(sum);
			System.out.print("\n");
			l--;
		}
		return 0;
	}
}

