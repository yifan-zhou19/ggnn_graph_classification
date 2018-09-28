package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int p = 0; p < m; p++)
		{
			for (int q = 0; q < n; q++)
			{
				int s = 0;
				if (p - 1 < 0)
				{
					s++;
				}
				if (p - 1 >= 0 && a[p - 1][q] <= a[p][q])
				{
					s++;
				}
				if (p + 1 >= m)
				{
					s++;
				}
				if (p + 1 < m && a[p + 1][q] <= a[p][q])
				{
					s++;
				}
				if (q - 1 < 0)
				{
					s++;
				}
				if (q - 1 >= 0 && a[p][q - 1] <= a[p][q])
				{
					s++;
				}
				if (q + 1 >= n)
				{
					s++;
				}
				if (q + 1 < n && a[p][q + 1] <= a[p][q])
				{
					s++;
				}
				if (s == 4)
				{
					System.out.print(p);
					System.out.print(' ');
					System.out.print(q);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

