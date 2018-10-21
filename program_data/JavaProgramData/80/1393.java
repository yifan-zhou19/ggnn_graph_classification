package <missing>;

public class GlobalMembers
{
	public static int isLeapYear(int year)
	{
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
	}

	public static int deltayear(int year1, int year2)
	{
		int i;
		int result;
		result = 0;
		for (i = year1 ; i < year2 ; i++)
		{
		   if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		   {
				result += 366;
		   }
			else
			{
				result += 365;
			}
		}
		return result;
	}

	public static int deltamonth(int year1, int year2, int month1, int month2)
	{
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int result;
		result = 0;
		if (isLeapYear(year1) != 0)
		{
			m[1] = 29;
		}
		for (i = 0 ; i < month1 - 1 ; i++)
		{
			result -= m[i];
		}
		if (isLeapYear(year1) != 0)
		{
			m[1] = 28;
		}
		if (isLeapYear(year2) != 0)
		{
			m[1] = 29;
		}
		for (i = 0 ; i < month2 - 1 ; i++)
		{
			result += m[i];
		}
		if (isLeapYear(year2) != 0)
		{
			m[1] = 28;
		}
		return result;
	}

	public static int deltaday(int day1, int day2)
	{
		int result;
		result = 0;
		result -= day1;
		result += day2;
		return result;
	}

	public static int delta(int year1, int month1, int day1, int year2, int month2, int day2)
	{
		int result;
		result = deltayear(year1, year2) + deltamonth(year1, year2, month1, month2) + deltaday(day1, day2);
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
		int result;
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
		result = delta(year1, month1, day1, year2, month2, day2);
		System.out.printf("%d",result);
		return 0;
	}

}

