package <missing>;

public class GlobalMembers
{
	public static int DiJiTian(int year, int month, int day)
	{
		int result = 0;
		for (int j = 1; j < month; j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				result += 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				result += 30;
			}
			else if (j == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
	}
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
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
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int zongyear;
		int zongday;
		int xiangchaday;
		int x;
		int y;
		int i;
		int e;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
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
		if (year1 > year2)
		{
			e = year1;
			year1 = year2;
			year2 = e;
			f = month1;
			month1 = month2;
			month2 = f;
			g = day1;
			day1 = day2;
			day2 = g;
		}
		x = DiJiTian(year1, month1, day1);
		y = DiJiTian(year2, month2, day2);
		zongyear = year2 - year1;
		zongday = zongyear * 365;
		for (i = year1;i < year2;i++)
		{
			if ((i % 100 != 0 && i % 4 == 0) || i % 400 == 0)
			{
				zongday += 1;
			}
		}
		xiangchaday = zongday + y - x;
		System.out.printf("%d",xiangchaday);
		return 0;
	}

}

