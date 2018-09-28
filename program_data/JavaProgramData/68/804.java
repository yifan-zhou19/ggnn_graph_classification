package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m = 6;
		int r;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (m <= n)
		{
			r = 3;
			while (r <= m / 2)
			{
				x = 2;
				while (x <= Math.sqrt(r))
				{
					y = r % x;
					if (y != 0)
					{
						x = x + 1;
					}
					else
					{
						x = r;
					}
				}
				if (x == r)
				{
				r = r + 2;
				}
				else
				{
					x = 2;
					while (x <= Math.sqrt(m - r))
					{
						y = (m - r) % x;
						if (y != 0)
						{
							x = x + 1;
						}
						else
						{
							x = m - r;
						}
					}
					if (x == m - r)
					{
						r = r + 2;
					}
					else
					{
						System.out.printf("%d=%d+%d\n",m,r,m - r);
						r = m;
					}
				}
			}
			m = m + 2;
		}
	}
}

