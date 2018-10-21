package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year = int y;
		int day = new int(int m,int d);
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int i;
		int x;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		for (i = y1;i < y2;i++)
		{
			k = k + year(i);
		}
		x = 365 * (y2 - y1) + k;
		x = x + day(m2, d2) - day(m1, d1);
		if (year(y1) == 1 && m1 > 2)
		{
			x--;
		}
		if (year(y2) == 1 && m2 >= 3)
		{
			x++;
		}
		System.out.printf("%d",x);
	}
	public static int year(int y)
	{
		int z;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return z;
	}
	public static int day(int m,int d)
	{
		int z;
		z = d;
		switch (m)
		{
			case 2:
				z = z + 31;
				break;
				case 3:
					z = z + 31 + 28;
					break;
				case 4:
					z = z + 31 * 2 + 28;
					break;
				case 5:
					z = z + 30 + 31 * 2 + 28;
					break;
				case 6:
					z = z + 31 * 3 + 30 + 28;
					break;
				case 7:
					z = z + 30 * 2 + 31 * 3 + 28;
					break;
				case 8:
					z = z + 31 * 4 + 30 * 2 + 28;
					break;
				case 9:
					z = z + 31 * 5 + 30 * 2 + 28;
					break;
				case 10:
					z = z + 30 * 3 + 31 * 5 + 28;
					break;
				case 11:
					z = z + 31 * 6 + 30 * 3 + 28;
					break;
				case 12:
					z = z + 30 * 4 + 31 * 6 + 28;
					break;
		}
		return z;
	}
}

