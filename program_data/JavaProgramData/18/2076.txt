package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int check()
	{
		int[][] a = new int[n][n];
		int c;
		int i;
		int j;
		int mi;
		int mj;
		int r = 0;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (c = n;c > 1;c--)
		{
			for (i = 0;i < c;i++)
			{
				mi = a[i][0];
				for (j = 0;j < c;j++)
				{
					if (mi > a[i][j])
					{
						mi = a[i][j];
					}
				}
				for (j = 0;j < c;j++)
				{
					a[i][j] -= mi;
				}
			}
			for (j = 0;j < c;j++)
			{
				mj = a[0][j];
				for (i = 0;i < c;i++)
				{
					if (mj > a[i][j])
					{
						mj = a[i][j];
					}
				}
				for (i = 0;i < c;i++)
				{
					a[i][j] -= mj;
				}
			}
			r += a[c - 2][c - 2];
			a[c - 2][c - 2] = a[c - 1][c - 1];
			for (i = 0;i < c - 2;i++)
			{
				a[i][c - 2] = a[i][c - 1];
			}
			for (j = 0;j < c - 2;j++)
			{
				a[c - 2][j] = a[c - 1][j];
			}
		}
		return r;
	}
	public static int Main()
	{
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (z = 0;z < n;z++)
		{
			System.out.printf("%d\n",check());
		}
		return 0;
	}

}

