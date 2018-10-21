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
		int days = 0;
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
				days += 366;
			}
			else
			{
				days += 365;
			}
		}
		for (i = 1; i < endMonth; i++)
		{
			switch (i)
			{
			case 1:
				;
			case 3:
				;
			case 5:
				;
			case 7:
				;
			case 8:
				;
			case 10:
				;
			case 12:
				days += 31;
				break;
			case 2:
			{
					if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
					{
						days += 29;
						break;
					}
					else
					{
						days += 28;
						break;
					}
			}
			default :
				days += 30;
				break;
			}
		}
		days += endDay;
		for (i = 1; i < startMonth; i++)
		{
			switch (i)
			{
			case 1:
				;
			case 3:
				;
			case 5:
				;
			case 7:
				;
			case 8:
				;
			case 10:
				;
			case 12:
				days -= 31;
				break;
			case 2:
			{
					if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
					{
						days -= 29;
						break;
					}
					else
					{
						days -= 28;
						break;
					}
			}
			default :
				days -= 30;
				break;
			}
		}
		days -= startDay;
		System.out.print(days);
		System.out.print("\n");
		return 0;
	}
}

