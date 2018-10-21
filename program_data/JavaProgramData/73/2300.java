package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int s;
		int t;
		int x;
		int y;
		int q;
		int m;
		int n;
		int i;
		int j;
		int r;
		q = 0;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		for (r = 1;r < 6;r++)
		{
		m = a[1][r];
		for (i = 1;i < 6;i++)
		{
			if (a[i][r] <= m)
			{
			m = a[i][r];
			s = i;
			}
		}
		for (i = s;i < s + 1;i++)
		{
		n = a[s][1];
			for (j = 1;j < 6;j++)
			{
				if (a[s][j] >= n)
				{
				n = a[s][j];
				y = j;
				}
			}

			if (y == r)
			{
			System.out.printf("%d %d %d",s,y,a[s][y]);
			q = 1;
			}
		}
		}

		if (q == 0)
		{
			System.out.print("not found");
		}
	return 0;
	}

}

