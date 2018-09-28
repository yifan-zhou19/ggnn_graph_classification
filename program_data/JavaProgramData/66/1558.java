package <missing>;

public class GlobalMembers
{
	public static int[] normal_months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leap_months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static String[] week_days = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};

	public static int is_leap(int year)
	{
		if (year % 100 == 0)
		{
			return year % 400 == 0;
		}

		return year % 4 == 0;
	}

	public static int Main()
	{
		int year;
		int month;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}

		int[] months = is_leap(year) != 0 ? leap_months : normal_months;

		int days = 0;
		int i;
		for (i = 0; i < month - 1; i++)
		{
			days += months[i];
		}

		days += day;

		days += (year - 1) * (365 % 7);
		days += (year - 1) / 4 * 1;
		days -= (year - 1) / 100 * 1;
		days += (year - 1) / 400 * 1;

		System.out.printf("%s\n", week_days[days % 7]);
	}
}

