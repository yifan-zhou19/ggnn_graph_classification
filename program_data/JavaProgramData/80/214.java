package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int year;
		int month;
		int day;
		int days;
		for (year = year1 ; year < year2 ; year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				days = 366;
			}
			else
			{
				days = 365;
			}
			sum = sum + days;
		}
		for (month = 1 ; month < month1 ; month++)
		{
			if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
			{
				mon[2] = 29;
			}
			sum = sum - mon[month];
		}
		for (day = 1 ; day < day1 ; day++)
		{
			sum--;
		}
		for (month = 1 ; month < month2 ; month++)
		{
			if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
			{
				mon[2] = 29;
			}
			sum = sum + mon[month];
		}
		for (day = 1 ; day < day2 ; day++)
		{
			sum++;
		}
		System.out.print(sum);


		return 0;
	}

}

