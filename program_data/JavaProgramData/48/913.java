package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[9][9];
		int[][] temp = new int[9][9];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = n;
		while (m != 0)
		{
			m--;
			for (int i = 1;i < 8;i++)
			{
				for (int j = 1;j < 8;j++)
				{
					if (a[i][j] != 0)
					{
						for (int p = i - 1;p <= i + 1;p++)
						{
							for (int q = j - 1;q <= j + 1;q++)
							{
								temp[p][q] += a[i][j];
							}
						}
						temp[i][j] += a[i][j];
					}
				}
			}
			for (int i = 0;i < 9;i++)
			{
				for (int j = 0;j < 9;j++)
				{
					a[i][j] = temp[i][j];
					temp[i][j] = 0;
				}
			}
		}
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				if (j == 8)
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

