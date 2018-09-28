package <missing>;

public class GlobalMembers
{
	public static int leap(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int days(int year, int month, int day)
	{
		int i; //???
		int days = 0;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				days += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			if (i == 2)
			{
				if (leap(year) != 0)
				{
					days += 29;
				}
				else
				{
					days += 28;
				}
			}
		}
		days += day;
		return days;
	}
	public static void Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int total = 0;
		int i;
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
		if (y1 == y2)
		{
			total = days(y2, m2, d2) - days(y1, m1, d1);
		}
		else
		{

			if (leap(y1) != 0)
			{
				total = 366 - days(y1, m1, d1);
			}
			else
			{
				total = 365 - days(y1, m1, d1);
			}
			for (i = y1 + 1;i < y2;i++)
			{
				if (leap(i) != 0)
				{
					total += 366;
				}
				else
				{
					total += 365;
				}
			}
			total += days(y2, m2, d2);
		}
		System.out.printf("%d\n",total);
	}

}

