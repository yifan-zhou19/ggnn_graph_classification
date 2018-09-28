package <missing>;

public class GlobalMembers
{
	public static int[] leapyearmonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] commonyearmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] dayofyear = {365, 366};
	//????????
	public static int IsLeapYear(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
	int startYear;
	int startMonth;
	int startDay;
	int endYear;
	int endMonth;
	int endDay;
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
	int daybetweendates = 0;
	int i;
	int j;
	int k;
		if (endYear == startYear)
		{
		int startdate = 0;
		int enddate = 0;
		if (IsLeapYear(startYear) == 1)
		{
			startdate += startDay;
			for (i = 0;i < startMonth - 1;i++)
			{
				startdate += leapyearmonth[i];
			}
			enddate += endDay;
			for (i = 0;i < endMonth - 1;i++)
			{
				enddate += leapyearmonth[i];
			}
		}
		if (IsLeapYear(startYear) == 0)
		{
			startdate += startDay;
			for (i = 0;i < startMonth - 1;i++)
			{
				startdate += commonyearmonth[i];
			}
			enddate += endDay;
			for (i = 0;i < endMonth - 1;i++)
			{
				enddate += commonyearmonth[i];
			}
		}
		daybetweendates += enddate - startdate;
		}
		if (endYear - startYear > 0)
		{
		for (i = 1;i < endYear - startYear;i++)
		{
			daybetweendates += dayofyear[IsLeapYear(startYear + i)];
		}
		if (IsLeapYear(startYear) == 1)
		{
		daybetweendates += leapyearmonth[startMonth - 1] - startDay;
		for (j = startMonth;j < 12;j++)
		{
			daybetweendates += leapyearmonth[j];
		}
		}
		if (IsLeapYear(startYear) == 0)
		{
		daybetweendates += commonyearmonth[startMonth - 1] - startDay;
		for (k = startMonth;k < 12;k++)
		{
			daybetweendates += commonyearmonth[k];
		}
		}
		if (IsLeapYear(endYear) == 1)
		{
		daybetweendates += endDay;
		for (j = 0;j < endMonth - 1;j++)
		{
			daybetweendates += leapyearmonth[j];
		}
		}
		if (IsLeapYear(endYear) == 0)
		{
		daybetweendates += endDay;
		for (k = 0;k < endMonth - 1;k++)
		{
			daybetweendates += commonyearmonth[k];
		}
		}
		}
		System.out.printf("%d\n",daybetweendates);
		return 0;
	}
}

