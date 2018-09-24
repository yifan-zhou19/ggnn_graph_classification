package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int s;
		int i;
		int j;
		int[][] a = new int[100][100];
		int p;
		int q;
		int r;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		s = m + n - 2;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (p = 0;p <= s;p++)
		{
			if (m >= n)
			{
				if (p <= (n - 1))
				{
					t = 0;
					r = p;
				}
				else
				{
					if (p <= (m - 1))
					{
						t = p - n + 1;
						r = p;
					}
					else
					{
						t = p - n + 1;
						r = m - 1;
					}
				}
			}
			else
			{
				if (p <= (m - 1))
				{
					t = 0;
					r = p;
				}
				else
				{
					if (p <= (n - 1))
					{
						t = 0;
						r = m - 1;
					}
					else
					{
						t = p - n + 1;
						r = m - 1;
					}
				}
			}
					for (q = t;q <= r;q++)
					{
				System.out.printf("%d\n",a[q][p - q]);
					}
		}
		return 0;
	}
}

