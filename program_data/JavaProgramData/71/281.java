package <missing>;

public class GlobalMembers
{
	public static int[] normal_months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leap_months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int is_leap(int year)
	{
		if (year % 100 == 0)
		{
			return year % 400 == 0;
		}

		return year % 4 == 0;
	}

	public static int day_of_year(int year, int month, int day)
	{
		int[] months = is_leap(year) != 0 ? leap_months : normal_months;

		int days = 0;
		int i;
		for (i = 0; i < month - 1; i++)
		{
			days += months[i];
		}

		days += day;

		return days;
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0; i < n; i++)
		{
			int year;
			int month1;
			int month2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			int days1 = day_of_year(year, month1, 1);
			int days2 = day_of_year(year, month2, 1);

			if ((days1 - days2) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

