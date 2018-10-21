package <missing>;

public class GlobalMembers
{
	public static void Change(int[][] b, int day)
	{
		int i;
		int j;
		int k;
		int l;
		int[][] c = new int[11][11];
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				for (k = i - 1;k <= i + 1;k++)
				{
					for (l = j - 1;l <= j + 1;l++)
					{
						c[i][j] = c[i][j] + b[k][l];
					}
				}
					c[i][j] = c[i][j] + b[i][j];
			}
		}
		if (day == 1)
		{
		for (int p = 1;p < 10;p++)
		{
			System.out.print(c[p][1]);
			for (int q = 2;q < 10;q++)
			{
				System.out.print(" ");
				System.out.print(c[p][q]);
			}
			System.out.print("\n");
		}
		}
		else
		{
			Change(c, day - 1);
		}

	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[11][11];
		a[5][5] = m;
		Change(a, n);

		System.in.read();
		return 0;
	}
}

