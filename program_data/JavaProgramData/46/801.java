package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[100][100];
		int k;
		int r;
		int c;
		int row;
		int col;
		int s;
		int a1;
		int a2;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		s = 0;
		t = row * col;
		a1 = 0;
		a2 = 0;
		r = 0;
		c = 0;
		for (k = 0;k <= 100;k++)
		{
			for (c = a2;c < col;c++)
			{
				System.out.printf("%d\n",a[r][c]);
				s++;
				if (s == t)
				{
					return 0;
				}
			}
			col--;
			c--;
			a1++;
			for (r = a1;r < row;r++)
			{
				System.out.printf("%d\n",a[r][c]);
				s++;
				if (s == t)
				{
					return 0;
				}
			}
			row--;
			r--;
			for (c = col - 1;c >= a2;c--)
			{
				System.out.printf("%d\n",a[r][c]);
				s++;
				if (s == t)
				{
					return 0;
				}
			}
			c++;
			for (r = row - 1;r >= a1;r--)
			{
				System.out.printf("%d\n",a[r][c]);
				s++;
				if (s == t)
				{
					return 0;
				}
			}
			r++;
			a2++;
		}
	}
}

