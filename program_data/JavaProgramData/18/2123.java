package <missing>;

public class GlobalMembers
{
	public static int hang(int[] a, int n, int h)
	{
		int m = a[0];
		for (int i = h;i < n;i++)
		{
			if (a[i] < m)
			{
				m = a[i];
			}
		}
		return (m);
	}
	public static int lie(int[][] a, int n, int j, int h)
	{
		int m = a[0][j];
		for (int i = h;i < n;i++)
		{
			if (a[i][j] < m)
			{
				m = a[i][j];
			}
		}
		return (m);
	}
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			int i;
			int j;
			int h;
			int s = 0;
			int hm;
			int lm;
			int[][] a = new int[110][110];
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (h = 1;h < n;h++)
			{
					hm = hang(a[0], n, h);
					a[0][0] -= hm;
				for (j = h;j < n;j++)
				{
					a[0][j] -= hm;
				}
				for (i = h;i < n;i++)
				{
					hm = hang(a[i], n, h);
					a[i][0] -= hm;
				for (j = h;j < n;j++)
				{
					a[i][j] -= hm;
				}
				}
				lm = lie(a, n, 0, h);
				a[0][0] -= lm;
				for (i = h;i < n;i++)
				{
					a[i][0] -= lm;
				}
				for (j = h;j < n;j++)
				{
					lm = lie(a, n, j, h);
					a[0][j] -= lm;
				for (i = h;i < n;i++)
				{
					a[i][j] -= lm;
				}
				}
				s += a[h][h];
			}
			System.out.printf("%d\n",s);
		}
	}

}

