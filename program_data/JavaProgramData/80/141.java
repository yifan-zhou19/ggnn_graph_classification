package <missing>;

public class GlobalMembers
{
	public static int leapYear(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int[][] month =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int i;
		int startYear;
		int endYear;
		int startMonth;
		int endMonth;
		int startDay;
		int endDay;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startYear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startMonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startDay = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endYear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endMonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endDay = Integer.parseInt(tempVar6);
		}
		if (startYear < endYear)
		{
			for (i = startMonth + 1; i <= 12; i++)
			{
				count += month[leapYear(startYear)][i];
			}
			for (i = 1; i < endMonth; i++)
			{
				count += month[leapYear(endYear)][i];
			}
			count += month[leapYear(startYear)][startMonth] - startDay;
			count += endDay;
		}
		else
		{
			for (i = startMonth + 1; i < endMonth; i++)
			{
				count += month[leapYear(startYear)][i];
			}
			if (startMonth < endMonth)
			{
				count += month[leapYear(startYear)][startMonth] - startDay;
				count += endDay;
			}
			else
			{
				count += endDay - startDay;
			}
		}
		for (i = startYear + 1;i < endYear; i++)
		{
			count += 365 + leapYear(i);
		}
		System.out.printf("%d",count);
		return 0;
	}

}

