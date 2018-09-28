package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[20][20];
	public static void gaocheng(int i,int j)
	{
		if (i == 0 && j > 0 && j < n)
		{
			if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		else if (i == 0 && j > 0 && j < n)
		{
			if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		else if (j == 0 && i > 0 && i < m)
		{
			if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		else if (j == n && i > 0 && i < m)
		{
			if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		else if (j == 0 && i == 0)
		{
			if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		else if (i == 0 && j == n)
		{
			if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		else if (i == m && j == 0)
		{
			if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		else if (i == m && j == n)
		{
			if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		else
		{
			if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
			{
			System.out.print(i);
			System.out.print(" ");
			System.out.print(j);
			System.out.print("\n");
			}
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
				gaocheng(i, j);
			}
		}

	}
}

