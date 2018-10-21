package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int s;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		s = (d - a) * 365;
		for (x = 0,i = a;i <= d - 1;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				x = x + 1;
			}
		}
		s += x;
		s = s - c + f;
		y = 30 * (b - 1);
		for (x = 1;x < b;x++)
		{
			if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10)
			{
				y = y + 1;
			}
			else if (x == 2)
			{
				if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
				{
					y = y - 1;
				}
				else
				{
					y = y - 2;
				}
			}
		}
			z = 30 * (e-1);
			for (x = 1;x < e;x++)
			{
			if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10)
			{
				z = z + 1;
			}
			else if (x == 2)
			{
				if (d % 4 == 0 && d % 100 != 0 || d % 400 == 0)
				{
					z = z - 1;
				}
				else
				{
					z = z - 2;
				}
			}
			}
			s = s - y + z;
			System.out.printf("%d",s);
	}
}

