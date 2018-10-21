package <missing>;

public class GlobalMembers
{
	public static int year(int y)
	{
		int a;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			a = 366;
		}
		else
		{
			a = 365;
		}
		return (a);
	}
	public static int month(int m)
	{
		int d;
		switch (m)
		{
		case 1:
			d = 31;
			break;
		case 2:
			d = 28;
			break;
		case 3:
			d = 31;
			break;
		case 4:
			d = 30;
			break;
		case 5:
			d = 31;
			break;
		case 6:
			d = 30;
			break;
		case 7:
			d = 31;
			break;
		case 8:
			d = 31;
			break;
		case 9:
			d = 30;
			break;
		case 10:
			d = 31;
			break;
		case 11:
			d = 30;
			break;
		case 12:
			d = 31;
			break;
		}
		return (d);
	}
	public static void Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int ds = 0;
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
			ds = ds + year(i);
		}
		for (i = 1;i < m1;i++)
		{
			ds = ds - month(i);
		}
		for (i = 1;i < m2;i++)
		{
			ds = ds + month(i);
		}
		ds = ds + d2 - d1;
		if (y1 == y2 && year(y1) == 366)
		{
			if (m2 > 2 && m1 < 3)
			{
				ds = ds + 1;
			}
		}
		if (y1 != y2)
		{
			if (year(y1) == 366 && m1 > 2)
			{
				ds = ds - 1;
			}
			if (year(y2) == 366 && m2 > 2)
			{
				ds = ds + 1;
			}
		}
		System.out.printf("%d\n",ds);
	}
}

