package <missing>;

public class GlobalMembers
{
	/*
	 *  ???? ?????????
	 *
	 *  ??: 2011-11-6
	 *  ??????
	 */
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int m;
		int i;
		int j;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;m <= n;m++)
		{
			int s = 0;
			int t = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (y = n;y >= 2;y--)
			{
			for (i = 0;i < n - t;i++)
			{
				x = a[i][0];
				for (j = 0;j < n - t;j++)
				{
					if (x > a[i][j])
					{
						x = a[i][j];
					}
				}
				for (j = 0;j < n - t;j++)
				{
					a[i][j] -= x;
				}
			}
			for (j = 0;j < n - t;j++)
			{
				x = a[0][j];
				for (i = 0;i < n - t;i++)
				{
					if (x > a[i][j])
					{
						x = a[i][j];
					}
				}
				for (i = 0;i < n - t;i++)
				{
					a[i][j] -= x;
				}
			}
			s = s + a[1][1];
			for (i = 0;i < n - t;i++)
			{
				for (j = 1;j < n - t - 1;j++)
				{
					a[i][j] = a[i][j + 1];
				}
			}
			t++;
			for (j = 0;j < n - t;j++)
			{
				for (i = 1;i < n - t;i++)
				{
					a[i][j] = a[i + 1][j];
				}
			}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

