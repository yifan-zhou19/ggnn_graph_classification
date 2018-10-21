package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int s = 0;
		int b;
		int t = 0;
		int r = 0;
		int c = 0;
		int R;
		int rmin = 0;
		int C;
		int cmin = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			R = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			C = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < R;i++)
		{
			for (j = 0;j < C;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				t = t + 1;
			}
		}
		for (b = 0;b <= 10000;b++)
		{
			for (c = cmin;c < C;c++)
			{
				System.out.printf("%d\n",a[r][c]);
				s = s + 1;
				if (s == t)
				{
					return 0;
				}
			}
			C -= 1;
			c -= 1;
			rmin += 1;
			for (r = rmin;r < R;r++)
			{
				System.out.printf("%d\n",a[r][c]);
				s = s + 1;
				if (s == t)
				{
					return 0;
				}
			}
			R -= 1;
			r -= 1;
			for (c = C - 1;c >= cmin;c--)
			{
				System.out.printf("%d\n",a[r][c]);
				s = s + 1;
				if (s == t)
				{
					return 0;
				}
			}
			c += 1;
			for (r = R - 1;r >= rmin;r--)
			{
				System.out.printf("%d\n",a[r][c]);
				s = s + 1;
				if (s == t)
				{
					return 0;
				}
			}
			r += 1;
			cmin += 1;
		}
	}
}

