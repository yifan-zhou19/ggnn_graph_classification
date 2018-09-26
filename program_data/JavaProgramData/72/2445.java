package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[20][20];

	public static int height(int i,int j)
	{
		if (i < 0 || i >= m != 0 || j < 0 || j >= n)
		{
			return -1;
		}
		else
		{
			return a[i][j];
		}
	}

	public static void check(int i,int j)
	{
		if (a[i][j] >= height(i - 1, j) != 0 && a[i][j] >= height(i + 1, j) != 0 && a[i][j] >= height(i, j - 1) != 0 && a[i][j] >= height(i, j + 1))
		{
			System.out.print(i);
			System.out.print(' ');
			System.out.print(j);
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				check(i, j);
			}
		}
		return 0;
	}


}

