package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < n;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
				if (a[0][0] >= a[0][1] != 0 && a[0][0] >= a[1][0])
				{
				  System.out.print("0 0");
				  System.out.print("\n");
				}
				  if (j != 0)
				  {
					  for (j = 1;j < n - 1;j++)
					  {
						if (a[0][j] >= a[1][j] != 0 && a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[0][j + 1])
						{
						System.out.print("0 ");
						System.out.print(j);
						System.out.print("\n");
						}
					  }
				  }
				  if (a[0][n - 1] >= a[0][n - 2] != 0 && a[0][n - 1] >= a[1][n - 1])
				  {
					System.out.print("0 ");
					System.out.print(n - 1);
					System.out.print("\n");
				  }

		for (i = 1;i < m - 1;i++)
		{
		for (j = 0;j < n;j++)
		{

			if (j == 0)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
				{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
			System.out.print("\n");
				}
			}
			else if (j != 0 && j != n - 1)
			{
			if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
			System.out.print("\n");
			}
			}
			else if (j == n - 1)
			{
				if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
				{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(n - 1);
				System.out.print("\n");
				}
			}
		}
		}
		 if (a[m - 1][0] >= a[m - 1][1] != 0 && a[m - 1][0] >= a[m - 2][0])
		 {
				  System.out.print(m - 1);
				  System.out.print(" 0");
				  System.out.print("\n");
		 }
				  if (j != 0)
				  {
					  for (j = 1;j < n - 1;j++)
					  {
						if (a[m - 1][j] >= a[m - 2][j] != 0 && a[m - 1][j] >= a[m - 1][j - 1] != 0 && a[m - 1][j] >= a[m - 1][j + 1])
						{
						System.out.print(m - 1);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						}
					  }
				  }
				  if (a[m - 1][n - 1] >= a[m - 1][n - 2] != 0 && a[m - 1][n - 1] >= a[m - 2][n - 1])
				  {
					System.out.print(m - 1);
					System.out.print(" ");
					System.out.print(n - 1);
					System.out.print("\n");
				  }

		return 0;
	}

}

