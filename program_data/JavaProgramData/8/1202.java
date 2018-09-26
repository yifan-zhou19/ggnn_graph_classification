package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[][] a = new int[2][100];
	public static void order(int x,int y)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < y;i++)
		{
			a[x][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < y - 1;i++)
		{
			for (j = 0;j < y - 1 - i;j++)
			{
				if (a[x][j] > a[x][j + 1])
				{
					t = a[x][j];
					a[x][j] = a[x][j + 1];
					a[x][j + 1] = t;
				}
			}
		}
	}
	public static void output()
	{
		int i;
		for (i = 0;i < n;i++)
		{
			System.out.print(a[0][i]);
			System.out.print(" ");
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.print(a[1][i]);
			System.out.print(" ");
		}
		System.out.print(a[1][m - 1]);
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		order(0, n),order(1,m);
		output();
		return 0;
	}
}

