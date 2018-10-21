package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int year1;
		int month1;
		int date1;
		int year2;
		int month2;
		int date2;
		int day = 0;
		int year;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		date1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		date2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (year1 == year2)
		{
			if (month1 == month2)
			{
				day += (date2 - date1);
			}
			else if (month1 < month2)
			{
				if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
				{
					year = 1;
				}
				else
				{
					year = 0;
				}
				day += (a[year][month1 - 1] - date1);
				for (int i = month1 + 1;i < month2;i++)
				{
					day += a[year][i - 1];
				}
				day += date2;
			}
		}
		else if (year1 < year2)
		{
			if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
			{
				year = 1;
			}
			else
			{
				year = 0;
			}
			day += (a[year][month1 - 1] - date1);
			for (int i = month1 + 1;i <= 12;i++)
			{
				day += a[year][i - 1];
			}
			for (int i = year1 + 1;i < year2;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					day += 366;
				}
				else
				{
					day += 365;
				}
			}
			if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
			{
				year = 1;
			}
			else
			{
				year = 0;
			}
			for (int i = 1;i < month2;i++)
			{
				day += a[year][i - 1];
			}
			day += date2;
		}
		System.out.print(day);
		System.out.print("\n");
		return 0;
	}
}

