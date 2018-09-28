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
		int i;
		int day = 0;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = startYear + 1;i < endYear;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				day = day + 366;
			}
			else
			{
				day = day + 365;
			}
		}
		if (startYear < endYear)
		{
			for (i = startMonth + 1;i <= 12;i++)
			{
			day = day + m[i];
			}
		for (i = 1;i < endMonth;i++)
		{
			day = day + m[i];
		}
		day = day + m[startMonth] - startDay;
		day = day + endDay;
		if ((startYear % 4 == 0 && startYear % 100 != 0 || startYear % 400 == 0) && startMonth < 3)
		{
			day = day + 1;
		}
		if ((endYear % 4 == 0 && endYear % 100 != 0 || endYear % 400 == 0) && endMonth >= 3)
		{
			day = day + 1;
		}
		}
		else
		{
			if (startMonth < endMonth)
			{
				for (i = startMonth + 1;i < endMonth;i++)
				{
					day = day + m[i];
				}
				day = m[startMonth] - startDay + endDay;
			}
			else
			{
				day = endDay - startDay;
			}
		}
		System.out.print(day);
		return 0;

	}
}

