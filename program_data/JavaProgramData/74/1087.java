package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int r;
		int s;
		int[] t = new int[21];
		int[] p = new int[21];
		int q = 0;
		int x;
		int y;
		int z;
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
		for (r = m;r <= n;r++)
		{
			x = 0;
			y = 1;
			z = r;
			do
			{
			t[x++] = z % 10;
			z = z / 10;
			} while (z != 0);
			for (s = 0;s <= x - 1;s++)
			{
				if (t[s] != t[x - 1 - s])
				{
					y = 0;
				}
			}
			if (y == 1)
			{
				for (s = 2;s <= r - 1;s++)
				{
					if (r % s == 0)
					{
						y = 0;
					}
				}
			}
			if (y == 1)
			{
				p[q++] = r;
			}
		}
		if (q == 0)
		{
			System.out.print("no\n");
		}
		else if (q == 1)
		{
			System.out.printf("%ld\n",p[0]);
		}
		else
		{
			for (r = 0;r <= q - 2;r++)
			{
			System.out.printf("%ld,",p[r]);
			}
		System.out.printf("%ld",p[q - 1]);
		}
	}




}

