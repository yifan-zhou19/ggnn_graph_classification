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
		int ans = 0;
		int day = 0;
		int i;
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = startYear; i < endYear; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				ans = ans + 366;
			}
			else
			{
				ans = ans + 365;
			}
		}
		for (i = 1; i < startMonth; i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				day = day + 31;
			}
			else if (i == 2)
			{
					if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
					{
						day = day + 29;
					}
					else
					{
						day = day + 28;
					}
			}
				else
				{
					day = day + 30;
				}
		}
		for (i = 1; i < startDay; i++)
		{
			day++;
		}
		ans = ans - day;
		day = 0;
		for (i = 1; i < endMonth; i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				day = day + 31;
			}
			else if (i == 2)
			{
					if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
					{
						day = day + 29;
					}
					else
					{
						day = day + 28;
					}
			}
				else
				{
					day = day + 30;
				}
		}
		for (i = 1; i < endDay; i++)
		{
			day++;
		}
		ans = ans + day;
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}


}

