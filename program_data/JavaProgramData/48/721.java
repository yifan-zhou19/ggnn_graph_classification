package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int q;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		while (n > 0)
		{
			n--;
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					for (p = -1;p <= 1;p++)
					{
						for (q = -1;q <= 1;q++)
						{
							b[i + p][j + q] += a[i][j]; //????????????????
						}
					}
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j] += b[i][j]; //???
					b[i][j] = 0;
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][j]);
			System.out.print("\n");
		}
		return 0;
	}
}

