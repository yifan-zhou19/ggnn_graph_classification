package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int k;
		int n;
		int m;
		int[] x = new int[6];
		int[] y = new int[6];
		int gg;
		int mm;
		int o = 0;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		m = -88888888;
		n = 888888888;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (a[i][j] > m)
				{
					m = a[i][j];
					gg = j;
				}
			}
			x[i] = gg;
			m = -8888888;

		}
			for (j = 1;j <= 5;j++)
			{
			for (i = 1;i <= 5;i++)
			{
				if (a[i][j] < n)
				{
					n = a[i][j];
					mm = i;
				}
			}
			y[j] = mm;
			n = 8888888;
			}

		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (y[x[i]] == i && x[y[j]] == j)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
					o++;
				}
			}
		}
		if (o == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

