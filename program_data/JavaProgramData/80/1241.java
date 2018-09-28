package <missing>;

public class GlobalMembers
{
	public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leap_days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int leap(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public static int daysum(int year,int month,int day)
	{
		int i;
		int c = day;
		for (i = 1;i < month;i++)
		{
			if (leap(year) != 0)
			{
				c += leap_days[i];
			}
			else
			{
				c += days[i];
			}
		}
		return c;
	}

	public static void Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int i;
		int n = 0;
		int a;
		int b;
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
		for (i = y1 + 1;i < y2;i++)
		{
			n += leap(i) != 0?366:365;
		}
		if (y1 == y2)
		{
			n = daysum(y2, m2, d2) - daysum(y1, m1, d1);
		}
		else
		{
			n = n + daysum(y2, m2, d2) + 365 - daysum(y1, m1, d1);
			if (leap(y1) != 0)
			{
				n++;
			}
		}
		System.out.printf("%d",n);
	}
}

