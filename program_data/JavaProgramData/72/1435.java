package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[25][25];
	public static void f(int x,int y)
	{
		if (x < m && y < n)
		{
			int d = 0;
			if ((x - 1 >= 0 && a[x][y] >= a[x - 1][y]) || x - 1 < 0)
			{
				d++;
			}
			if ((x + 1 < m && a[x][y] >= a[x + 1][y]) || x + 1 >= m)
			{
				d++;
			}
			if ((y - 1 >= 0 && a[x][y] >= a[x][y - 1]) || y - 1 < 0)
			{
				d++;
			}
			if ((y + 1 < n && a[x][y] >= a[x][y + 1]) || y + 1 >= n)
			{
				d++;
			}
			if (d == 4)
			{
				System.out.print(x);
				System.out.print(" ");
				System.out.print(y);
				System.out.print("\n");
			}
			if (y + 1 < n)
			{
				f(x, y + 1);
			}
			else
			{
				f(x + 1, 0);
			}
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		f(0, 0);
		return 0;
	}
}

