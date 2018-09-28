package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int[] Day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = 0;
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = startYear; i < endYear; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				day = day + 366;
			}
			else
			{
				day = day + 365;
			}
		}
		if ((endYear % 4 == 0 && endYear % 100 != 0) || endYear % 400 == 0)
		{
			Day[2] = 29;
		}
		for (int i = 1; i < endMonth; i++)
		{
			day = day + Day[i];
		}
		day = day + endDay;
		if ((startYear % 4 == 0 && startYear % 100 != 0) || startYear % 400 == 0)
		{
			Day[2] = 29;
		}
		else
		{
			Day[2] = 28;
		}
		for (int i = 1; i < startMonth; i++)
		{
			day = day - Day[i];
		}
		day = day - startDay;
		System.out.print(day);
		return 0;
	}

}

