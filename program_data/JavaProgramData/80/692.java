package <missing>;

public class GlobalMembers
{
	/*
	 * dates.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: admin
	 */
	public static int Main()
	{
	int startYear;
	int startMonth;
	int startDay;
	int endYear;
	int endMonth;
	int endDay;
	int i;
	int day1 = 0;
	int day2 = 0;
	int day3 = 0;
	int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if ((startYear % 4 == 0) && (startYear % 100 != 0) || (startYear % 400 == 0))
	{
		for (i = 1;i <= startMonth - 1;i++)
		{
			day1 = b[i] + day1;
		}
		day1 = day1 + startDay;
	}
	else
	{
		for (i = 1;i <= startMonth - 1;i++)
		{
		day1 = a[i] + day1;
		}
		day1 = day1 + startDay;
	}
	if ((endYear % 4 == 0) && (endYear % 100 != 0) || (endYear % 400 == 0))
	{
		for (i = 1;i <= endMonth - 1;i++)
		{
			day2 = b[i] + day2;
		}
		day2 = day2 + endDay;
	}
	else
	{
		for (i = 1;i <= endMonth - 1;i++)
		{
			day2 = a[i] + day2;
		}
		day2 = day2 + endDay;
	}
	for (i = startYear;i <= endYear - 1;i++)
	{
		if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0))
		{
			day3 = day3 + 366;
		}
		else
		{
			day3 = day3 + 365;
		}
	}
	System.out.print(day3 + day2 - day1);
	return 0;
	}
}

