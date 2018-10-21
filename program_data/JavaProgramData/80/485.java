package <missing>;

public class GlobalMembers
{
	public static int accountdays(int year, int month, int day)
	{
		int days = 0;
		int i;
		for (i = 1; i <= month; i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			else if (i == 2)
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					days += 29;
				}
				else
				{
					days += 28;
				}
			}
			else
			{
				days += 31;
			}
		}
		i = month;
		if (i == 4 || i == 6 || i == 9 || i == 11)
		{
				days = days - (30 - day);
		}
		else if (i == 2)
		{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					days -= 29 - day;
				}
				else
				{
					days -= 28 - day;
				}
		}
		else
		{
			days -= 31 - day;
		}
		return days;
	}



	public static int Main()
	{
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int days1;
		int days2;
		int i;

		year[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		days1 = accountdays(year[0], month[0], day[0]);
		days2 = accountdays(year[1], month[1], day[1]);
		if (year[1] > year[0])
		{
			for (i = year[0] + 1; i < year[1]; i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					days2 += 366;
				}
				else
				{
					days2 += 365;
				}
			}
			i = year[0];
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				days2 += 366 - days1;
			}
			else
			{
				days2 += 365 - days1;
			}
			System.out.print(days2);
		}
		else
		{
			System.out.print(days2 - days1);
		}
		return 0;
	}
}

