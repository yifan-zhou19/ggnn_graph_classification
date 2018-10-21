package <missing>;

public class GlobalMembers
{
	/*****************8??????????? *****************
	??
	???????????????.
	??2010-1-1?2010-1-3 ???2??
	year=1,2,...,3000.
	???
	????(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)?
	???2???29??
	????
	???
	startYear startMonth startDay
	???
	endYear endMonth endDay
	????
	????????????????
	????
	2008 1 1
	2009 1 1
	????
	366
	**********************************************************
	proframmer Qiu HEzi
	version 1.0
	cret date 2012.12.27
	**********************************************************/
	public static int Main()
	{
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		//?? ?         1    2   3  4  5  6  7  8  9 10 11 12
		int[] nmonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] rmonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int year = startYear ; year < endYear ; year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
		{
			for (int i = 1 ; i < startMonth ; i++)
			{
				sum -= rmonth[i];
			}
			sum -= startDay;
		}
		else
		{
			for (int i = 1 ; i < startMonth ; i++)
			{
				sum -= nmonth[i];
			}
			sum -= startDay;
		}
		if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
		{
			for (int i = 1 ; i < endMonth ; i++)
			{
				sum += rmonth[i];
			}
			sum += endDay;
		}
		else
		{
			for (int i = 1 ; i < endMonth ; i++)
			{
				sum += nmonth[i];
			}
			sum += endDay;
		}
		System.out.print(sum);
		return 0;
	}
}

