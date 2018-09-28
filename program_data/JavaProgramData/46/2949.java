package <missing>;

public class GlobalMembers
{
	public static int sum(int a,int b,int c)
	{
		int d = 0;
		int e;
		for (e = 1;e <= c;e++)
		{
			d = a + a + b + b - 4 * (2 * e-1) + d;
		}
	  return d;
	}

	public static int min(int a,int b,int c,int d)
	{
		if (a < b)
		{
		  b = a;
		}
		if (b < c)
		{
		  c = b;
		}
		if (c < d)
		{
		  d = c;
		}

	  return d;
	}

	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] s = new int[10000];
		int row;
		int col;
		int i;
		int j;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
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
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				b = col - j;
				c = row - i;
				d = min(i - 1, j - 1, b, c);
				e = sum(row, col, d);
				f = i - d;
				g = j - d;
				if (f == 1 && g >= 1)
				{
					h = e + g;
				}
				else if (g == (col - 2 * d) && f <= (row - 2 * d))
				{
					h = e + f + g - 1;
				}
				else
				{
					h = e + row + col - 1 - 4 * d + col - 2 * d - g + row - 2 * d - f;
				}

				s[h] = a[i][j];
			}
		}

		for (i = 1;i <= row * col;i++)
		{
			System.out.printf("%d\n",s[i]);
		}

	return 0;
	}

}

