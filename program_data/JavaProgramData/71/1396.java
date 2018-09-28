package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int y;
		int m1;
		int m2;
		int x = 0;
		int i;
		int x1;
		int x2;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (q = 0;q < p;q++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			m2 = Integer.parseInt(tempVar4);
		}
		i = (y - 1) / 400 * 400;
		for (; i + 100 < y ; i += 100)
		{
			x = x + 36524 % 7;
		}
		i = (y - 1) / 100 * 100 + 1;
		for (; i < y ; i++)
		{
			if (i % 4 != 0)
			{
				x = x + 365;
			}
			else
			{
				x = x + 366;
			}
		}
		x1 = x;
		for (i = 1 ; i < m1 ; i++)
		{
			if (1 == i || 3 == i || 5 == i || 7 == i || 8 == i || 10 == i || 12 == i)
			{
					x1 = x1 + 31;
			}
			else if (4 == i || 6 == i || 9 == i || 11 == i)
			{
					x1 = x1 + 30;
			}
			else if (y % 4 != 0 || (y % 400 != 0 && y % 100 == 0))
			{
					x1 = x1 + 28;
			}
			else
			{
				x1 = x1 + 29;
			}
		}
		x1 = (x1 + 1) % 7;
		x2 = x;
		for (i = 1 ; i < m2 ; i++)
		{
			if (1 == i || 3 == i || 5 == i || 7 == i || 8 == i || 10 == i || 12 == i)
			{
					x2 = x2 + 31;
			}
			else if (4 == i || 6 == i || 9 == i || 11 == i)
			{
					x2 = x2 + 30;
			}
			else if (y % 4 != 0 || (y % 400 != 0 && y % 100 == 0))
			{
					x2 = x2 + 28;
			}
			else
			{
				x2 = x2 + 29;
			}
		}
		x2 = (x2 + 1) % 7;
		if (x1 == x2)
		{
			System.out.print("YES\n");
		}
		if (x1 != x2)
		{
			System.out.print("NO\n");
		}
		}
	}
}

