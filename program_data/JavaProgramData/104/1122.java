package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		int i;
		int m;
		int n;
		for (i = 0;i < 10;i++)
		{
			if (Math.pow(2.0,i) <= x != 0 && x <= Math.pow(2.0,i + 1) - 1)
			{
				m = i;
				i = 11;
			}
		}
		for (i = 0;i < 10;i++)
		{
			if (Math.pow(2.0,i) <= y != 0 && y <= Math.pow(2.0,i + 1) - 1)
			{
				n = i;
				i = 11;
			}
		}
		if (m > n)
		{
			for (i = 1;i <= m - n;i++)
			{
				if (x / 2 * 2 == x)
				{
					x = x / 2;
				}
				else
				{
					x = (x - 1) / 2;
				}
			}
		}
		if (n > m)
		{
			for (i = 1;i <= n - m;i++)
			{
				if (y / 2 * 2 == y)
				{
					y = y / 2;
				}
				else
				{
					y = (y - 1) / 2;
				}
			}
		}
		int f = new int(int x,int y);
		System.out.printf("%d",f(x, y));
	}

	public static int f(int x,int y)
	{
		int z;
		if (x == y)
		{
			z = x;
			return z;
		}
		else if (x / 2 * 2 == x && y / 2 * 2 == y)
		{
			x = x / 2;
			y = y / 2;
			z = f(x, y);
		}
		else if (x / 2 * 2 != x && y / 2 * 2 != y)
		{
			x = (x - 1) / 2;
			y = (y - 1) / 2;
			z = f(x, y);
		}
		else if (x / 2 * 2 != x && y / 2 * 2 == y)
		{
			x = (x - 1) / 2;
			y = y / 2;
			z = f(x, y);
		}
		else if (x / 2 * 2 == x && y / 2 * 2 != y)
		{
			x = x / 2;
			y = (y - 1) / 2;
			z = f(x, y);
		}
	}
}

