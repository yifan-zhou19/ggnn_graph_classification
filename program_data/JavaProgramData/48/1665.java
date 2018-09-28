package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];
	public static int[] dx = {1, 1, 1, 0, 0, 0, -1, -1, -1};
	public static int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
	public static void change()
	{
		for (int i = 1;i <= 9;++i)
		{
			for (int j = 1;j <= 9;++j)
			{
				b[i][j] = a[i][j];
			}
		}
		for (int i = 1;i <= 9;++i)
		{
			for (int j = 1;j <= 9;++j)
			{
				if (b[i][j] != 0)
				{

					for (int k = 0;k < 9;++k)
					{
						a[i + dx[k]][j + dy[k]] += b[i][j];
					}
				}
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (int i = 0;i < n;++i)
		{
			change();
		}
		for (int i = 1;i <= 9;++i)
		{
			for (int j = 1;j <= 9;++j)
			{
				if (j != 9)
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
			else
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
			}
		}
	}
}

