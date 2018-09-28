package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int x;
		int y;
		int c;
		int d;
		int e;
		int f;
		int g;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		g = m * n;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		for (y = 0;y < n;y++)
		{
			for (x = 0;x < m;x++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[x][y] = Integer.parseInt(tempVar3);
				}
			}
		}

		while (g != 0)
		{
		if (g != 0)
		{
			if (c + d != m - 1)
			{
				for (x = c;x < m - d;x++)
				{
					System.out.printf("%d\n",a[x][e]);
					g--;
				}
				e++;
			}
			else
			{
				System.out.printf("%d\n",a[c][e]);
				g--;
				e++;
			}
		}

		if (g != 0)
		{
			if (e + f != n - 1)
			{
				for (y = e;y < n - f;y++)
				{
					System.out.printf("%d\n",a[m - d - 1][y]);
					g--;

				}
				d++;
			}
			else
			{
				System.out.printf("%d\n",a[m - d - 1][e]);
				d++;
				g--;
			}
		}

		if (g != 0)
		{
			if (c + d != m - 1)
			{
				for (x = m - d - 1;x >= c;x--)
				{
					System.out.printf("%d\n",a[x][n - f - 1]);
					g--;
				}
				f++;
			}
			else
			{
				System.out.printf("%d\n",a[c][n - f - 1]);
				g--;
				f++;
			}
		}
		if (g != 0)
		{
			if (e + f != n - 1)
			{
				for (y = n - f - 1;y >= e;y--)
				{
					System.out.printf("%d\n",a[c][y]);
					g--;

				}
				c++;

			}
			else
			{
				System.out.printf("%d\n",a[c][e]);
				c++;
				g--;
			}
		}
		}



		return 0;
	}
}

