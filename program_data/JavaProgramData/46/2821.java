package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int Main()
	{
		int row;
		int c;
		int i;
		int j;
		int d;
		int x;
		int l;
		int r;
		int s;
		int t;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		d = 1;
		r = c - 1;
		x = 0;
		l = row - 1;
		s = 1;
		y = 0;
		t = 0;
		System.out.printf("%d\n",a[0][0]);
		for (i = 1;i < row * c;i++)
		{
			if (d == 1)
			{
				if (t == r)
				{
					r = r - 1;
					d = -1;
				}
			}
			else if (d == -1)
			{
				if (y == l)
				{
					l = l - 1;
					d = 2;
				}
			}
			else if (d == 2)
			{
				if (t == x)
				{
					x = x + 1;
					d = -2;
				}
			}
			else if (d == -2)
			{
				if (y == s)
				{
					s = s + 1;
					d = 1;
				}
			}
			if (d == 1)
			{
				t = t + 1;
			}
			else if (d == -1)
			{
				y = y + 1;
			}
			else if (d == 2)
			{
				t = t - 1;
			}
			else if (d == -2)
			{
				y = y - 1;
			}
			System.out.printf("%d\n",a[y][t]);
		}
	}

}

