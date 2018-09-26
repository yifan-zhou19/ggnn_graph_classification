package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[21][21];
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i <= m - 1 ; i++)
		{
			for (j = 0 ; j <= n - 1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (a[0][0] >= a[0][1] != 0 && a[0][0] >= a[1][0])
		{
			System.out.print(0);
			System.out.print(' ');
			System.out.print(0);
			System.out.print("\n");
		}
		for (i = 1 ; i <= n - 2 ; i++)
		{
			if (a[0][i] >= a[0][i - 1] != 0 && a[0][i] >= a[0][i + 1] != 0 && a[0][i] >= a[1][i])
			{
				System.out.print(0);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
			}
		}
		if (a[0][n - 1] >= a[0][n - 2] != 0 && a[0][n - 1] >= a[1][n - 1])
		{
			System.out.print(0);
			System.out.print(' ');
			System.out.print(n - 1);
			System.out.print("\n");
		}
		for (j = 1 ; j <= m - 2 ; j++)
		{
			if (a[j][0] >= a[j][1] != 0 && a[j][0] >= a[j + 1][0] != 0 && a[j][0] >= a[j - 1][0])
			{
			   System.out.print(j);
			   System.out.print(' ');
			   System.out.print(0);
			   System.out.print("\n");
			}
			for (i = 1 ; i <= n - 2 ; i++)
			{
			   if (a[j][i] >= a[j][i - 1] != 0 && a[j][i] >= a[j][i + 1] != 0 && a[j][i] >= a[j + 1][i] != 0 && a[j][i] >= a[j - 1][i])
			   {
					 System.out.print(j);
					 System.out.print(' ');
					 System.out.print(i);
					 System.out.print("\n");
			   }
			}
			if (a[j][n - 1] >= a[j][n - 2] != 0 && a[j][n - 1] >= a[j + 1][n - 1] != 0 && a[j][n - 1] >= a[j - 1][n - 1])
			{
				System.out.print(j);
				System.out.print(' ');
				System.out.print(n - 1);
				System.out.print("\n");
			}
		}
		if (a[m - 1][0] >= a[m - 1][1] != 0 && a[m - 1][0] >= a[m - 2][0])
		{
			System.out.print(m - 1);
			System.out.print(' ');
			System.out.print(0);
			System.out.print("\n");
		}
		for (i = 1 ; i <= n - 2 ; i++)
		{
			if (a[m - 1][i] >= a[m - 1][i - 1] != 0 && a[m - 1][i] >= a[m - 1][i + 1] != 0 && a[m - 1][i] >= a[m - 2][i])
			{
				System.out.print(m - 1);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
			}
		}
		if (a[m - 1][n - 1] >= a[m - 1][n - 2] != 0 && a[m - 1][n - 1] >= a[m - 2][n - 1])
		{
			System.out.print(m - 1);
			System.out.print(' ');
			System.out.print(n - 1);
			System.out.print("\n");
		}
		return 0;
	}

}

