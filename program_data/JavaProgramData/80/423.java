package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int rankstartday = 0;
		int endyear;
		int endmonth;
		int endday;
		int rankendday = 0;
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		int year = 0;
		int month;
		int[] days1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] days2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (startyear == endyear)
		{
			if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
			{
				for (month = 1;month < startmonth;month++)
				{
					rankstartday = rankstartday + days2[month - 1];
				}
				rankstartday = rankstartday + startday;
				for (month = 1;month < endmonth;month++)
				{
					rankendday = rankendday + days2[month - 1];
				}
				rankendday = rankendday + endday;
			}
			if (!((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0)))
			{
				for (month = 1;month < startmonth;month++)
				{
					rankstartday = rankstartday + days1[month - 1];
				}
				rankstartday = rankstartday + startday;
				for (month = 1;month < endmonth;month++)
				{
					rankendday = rankendday + days1[month - 1];
				}
				rankendday = rankendday + endday;
			}
			sum = rankendday - rankstartday;
		}
		if (startyear < endyear)
		{
			if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
			{
				for (month = 1;month < startmonth;month++)
				{
					rankstartday = rankstartday + days2[month - 1];
				}
				rankstartday = rankstartday + startday;
				sum = 366 - rankstartday;
			}
			if (!((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0)))
			{
				for (month = 1;month < startmonth;month++)
				{
					rankstartday = rankstartday + days1[month - 1];
				}
				rankstartday = rankstartday + startday;
				sum = 365 - rankstartday;
			}
			for (year = startyear + 1;year < endyear;year++)
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					sum = sum + 366;
				}
				else
				{
					sum = sum + 365;
				}
			}
			if ((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0))
			{
				for (month = 1;month < endmonth;month++)
				{
					rankendday = rankendday + days2[month - 1];
				}
				rankendday = rankendday + endday;
				sum = sum + rankendday;
			}
			if (!((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0)))
			{
				for (month = 1;month < endmonth;month++)
				{
					rankendday = rankendday + days1[month - 1];
				}
				rankendday = rankendday + endday;
				sum = sum + rankendday;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

