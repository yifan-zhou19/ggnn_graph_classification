package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[30][30];
		for (int i = 0;i < 30;i++)
		{
		for (int j = 0;j < 30;j++)
		{
			a[i][j] = -1;
		}
		}
		for (int i = 0;i < m;i++)
		{
		for (int j = 0;j < n;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		if (a[0][0] >= a[0][1] != 0 && a[0][0] >= a[1][0])
		{
			System.out.print("0 0");
			System.out.print("\n");
		}
		for (int i = 1;i < n;i++)
		{
				if (a[0][i] >= a[0][i + 1] != 0 && a[0][i] >= a[0][i - 1] != 0 && a[0][i] >= a[1][i])
				{
				System.out.print("0 ");
				System.out.print(i);
				System.out.print("\n");
				}
		}
		for (int i = 1;i < m - 1;i++)
		{
		for (int j = 0;j < n;j++)
		{
				if (j == 0)
				{
						if (a[i][0] >= a[i][1] != 0 && a[i][0] >= a[i - 1][0] != 0 && a[i][0] >= a[i + 1][0])
						{
						System.out.print(i);
						System.out.print(" 0");
						System.out.print("\n");
						}
				}
						else
						{
							if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
							{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
							}
						}
		}
		}
		 if (a[m - 1][0] >= a[m - 1][1] != 0 && a[m - 1][0] >= a[m - 2][0] != 0 && a[m - 1][0] >= a[m - 2][1])
		 {
			 System.out.print(m - 1);
			 System.out.print(" 0");
			 System.out.print("\n");
		 }
		for (int i = 1;i < n;i++)
		{
			if (a[m - 1][i] >= a[m - 1][i - 1] != 0 && a[m - 1][i] >= a[m - 2][i] != 0 && a[m - 1][i] >= a[m - 1][i + 1])
			{
				System.out.print(m - 1);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}

		return 0;
	}


}

