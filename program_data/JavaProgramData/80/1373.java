package <missing>;

public class GlobalMembers
{
	public static int[] monthday = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int leap(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
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
		int month;
		int year;
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int day = 0;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (year = year1 + 1; year <= year2 - 1; year++)
		{
			day += 365 + leap(year);
		}
		if (year1 < year2)
		{
			for (month = 1; month < month2; month++)
			{
					day += monthday[month];
			}
			day += day2;
			if (leap(year2) != 0 && month2 >= 3)
			{
				day++;
			}
			for (month = month1; month <= 12; month++)
			{
				day += monthday[month];
			}
			day -= day1;
			if (leap(year1) != 0 && month1 < 3)
			{
				day++;
			}
		}
		else
		{
			if (month1 != month2)
			{
			for (month = month1; month < month2; month++)
			{

				{
					day += monthday[month];
					day += day2;
					day -= day1;
					if (leap(year1) != 0 && month1 < 3)
					{
						day++;
					}
			}

			}
			}
			else
			{
					day = day2 - day1;
			}
		}
		System.out.print(day);
		System.out.print("\n");
		return 0;
	}
}

