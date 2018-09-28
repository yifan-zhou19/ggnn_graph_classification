package <missing>;

public class GlobalMembers
{
	public static int leapYear(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 366;
		}
		else
		{
			return 365;
		}
	}
	public static int Main()
	{
		int startYear = 0; //???????
		int startMonth = 0;
		int startDay = 0;
		int endYear = 0;
		int endMonth = 0;
		int endDay = 0;
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		int i = 0;
		int j = 0;
		int[] leap = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] ping = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = startYear; i < endYear; i++)
		{
			sum = sum + leapYear(i);
		}
		for (i = 1; i < startMonth; i++)
		{
			if (leapYear(startYear == 366) != 0)
			{
				sum = sum - leap[i];
			}
			else
			{
				sum = sum - ping[i];
			}
		}
		sum = sum - startDay;
		for (i = 1; i < endMonth; i++)
		{
			if (leapYear(endYear == 366) != 0)
			{
				sum = sum + leap[i];
			}
			else
			{
				sum = sum + ping[i];
			}
		}
		sum = sum + endDay;
		System.out.print(sum);

		return 0;
	}
}

