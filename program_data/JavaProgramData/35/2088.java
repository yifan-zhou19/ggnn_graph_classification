package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];

	public static int h_max(int h, int n)
	{
		int tmp_max = -1;
		int tmp_idx = 0;
		int i;
		for (i = 0; i < n; ++i)
		{
			if (tmp_max < a[h][i])
			{
				tmp_max = a[h][i];
				tmp_idx = i;
			}
		}
		return tmp_idx;
	}

	public static int c_min(int c, int m)
	{
		int tmp_min = 999999;
		int tmp_idx = 0;
		int i;
		for (i = 0; i < m; ++i)
		{
			if (tmp_min > a[i][c])
			{
				tmp_min = a[i][c];
				tmp_idx = i;
			}
		}
		return tmp_idx;
	}

	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0; i < m; ++i)
		{
			for (j = 0; j < n; ++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			};
		}
		int flag = 0;
		for (i = 0; i < m; ++i)
		{
			int h = h_max(i, n);
			int c = c_min(h, m);
			if (i == c)
			{
				flag = 1;
				System.out.print(c);
				System.out.print("+");
				System.out.print(h);
				System.out.print("\n");
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
			System.out.print("\n");
		}
		return 0;
	}

}

