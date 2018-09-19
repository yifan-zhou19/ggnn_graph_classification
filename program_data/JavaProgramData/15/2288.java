package <missing>;

public class GlobalMembers
{
	/*
	 * ????ex509.cpp
	 * ?????2012-11-2
	 * ??????
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num = 0;
		int x1 = 1000;
		int y1 = 1000;
		int x2 = 0;
		int y2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int N = n;
		int[][] a = new int[N][N];
		for (i = 0;i < n;++i)
		{
			for (j = 0;j < n;++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;++i)
		{
			for (j = 0;j < n;++j)
			{
				if (a[i][j] == 0)
				{
					if (i < x1)
					{
						x1 = i;
					}
					if (j < y1)
					{
						y1 = j;
					}
					if (i > x2)
					{
						x2 = i;
					}
					if (j > y2)
					{
						y2 = j;
					}
				}
			}
		}
		num = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.print(num);
		return 0;
	}
}

