package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[20][20];
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < m;j++)
		{
			for (i = 0;i < n;i++)
			{
				a[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j < m;j++)
		{
			if (j == 0)
			{
				if (a[0][0] >= a[1][0] != 0 && a[0][0] >= a[0][1])
				{
					System.out.print(j);
					System.out.print(" 0");
					System.out.print("\n");
				}
				for (i = 1;i < n - 1;i++)
				{
					if (a[0][i] >= a[0][i - 1] != 0 && a[0][i] >= a[0][i + 1] != 0 && a[0][i] >= a[1][i])
					{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					}
				}
				if (a[0][n - 1] >= a[1][n - 1] != 0 && a[0][n - 1] >= a[0][n - 2])
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(n - 1);
					System.out.print("\n");
				}
				continue;
			}
			if (j > 0 && j < m - 1)
			{
				if (a[j][0] >= a[j + 1][0] != 0 && a[j][0] >= a[j][1] != 0 && a[j][0] >= a[j - 1][0])
				{
					System.out.print(j);
					System.out.print(" 0");
					System.out.print("\n");
				}
				for (i = 1;i < n - 1;i++)
				{
					if (a[j][i] >= a[j][i - 1] != 0 && a[j][i] >= a[j][i + 1] != 0 && a[j][i] >= a[j - 1][i] != 0 && a[j][i] >= a[j + 1][i])
					{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					}
				}
				if (a[j][n - 1] >= a[j + 1][n - 1] != 0 && a[j][n - 1] >= a[j - 1][n - 1] != 0 && a[j][n - 1] >= a[j][n - 2])
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(n - 1);
					System.out.print("\n");
				}
				continue;
			}
			if (j == m - 1)
			{
				if (a[j][0] >= a[j][1] != 0 && a[j][0] >= a[j - 1][0])
				{
					System.out.print(j);
					System.out.print(" 0");
					System.out.print("\n");
				}
				for (i = 1;i < n - 1;i++)
				{
					if (a[j][i] >= a[j][i - 1] != 0 && a[j][i] >= a[j][i + 1] != 0 && a[j][i] >= a[j - 1][i])
					{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					}
				}
				if (a[j][n - 1] >= a[j - 1][n - 1] != 0 && a[j][n - 1] >= a[j][n - 2])
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(n - 1);
					System.out.print("\n");
				}
				continue;
			}
		}
		return 0;
	}

}

