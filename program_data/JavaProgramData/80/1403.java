package <missing>;

public class GlobalMembers
{
	public static int R(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4) == 0 && year % 100 != 0)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int Main()
	{
		int year1;
		int month;
		int day;
		int total1;
		int year;
		int total2;
		int tianshu;
		int year2;
		int month2;
		int day2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		total1 = 0;
		total2 = 0;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total1 += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total1 += 30;
			}
			else if (i == 2)
			{
				year = year1;
				if (R(year) != 0)
				{
					total1 += 29;
				}
				else
				{
					total1 += 28;
				}
			}
		}
		total1 += day;
		for (year = 1;year < year1;year++)
		{
			if (R(year) != 0)
			{
				total1 += 366;
			}
			else
			{
				total1 += 365;
			}
		}
		for (i = 1;i < month2;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total2 += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total2 += 30;
			}
			else if (i == 2)
			{
				year = year2;
				if (R(year) != 0)
				{
					total2 += 29;
				}
				else
				{
					total2 += 28;
				}
			}
		}
		total2 += day2;
		for (year = 1;year < year2;year++)
		{
			if (R(year) != 0)
			{
				total2 += 366;
			}
			else
			{
				total2 += 365;
			}
		}
		tianshu = (total2 - total1) > 0?(total2 - total1): (total1 - total2);
		System.out.printf("%d",tianshu);
		return 0;
	}

}

