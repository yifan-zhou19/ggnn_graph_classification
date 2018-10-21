package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int startyear;
		int endyear;
		int startmonth;
		int endmonth;
		int startday;
		int endday;
		int days;
		int days2;
		int temp1;
		int temp2;
		int flag1;
		int flag2;
		int year;
		int month;
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (startyear == endyear)
		{
			days = 0;
			if (startyear % 4 == 0 && startyear % 100 != 0 || startyear % 400 == 0)
			{
				a[1] = 29;
			}
			else
			{
				a[1] = 28;
			}
			for (month = startmonth ; month < endmonth ; month++)
			{
				days = days + a[month - 1];
			}
			days = days + endday - startday;
			System.out.print(days);
			System.out.print("\n");
		}
		else if (startyear < endyear)
		{
			days = 0;
			days2 = 0;
			for (year = startyear ; year < endyear ; year++)
			{
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					days = days + 366;
				}
				else
				{
					days = days + 365;
				}
			}
			flag1 = startmonth;
			flag2 = endmonth;
			if (startmonth > endmonth)
			{
				temp1 = startmonth;
				temp2 = startday;
				startmonth = endmonth;
				startday = endday;
				endmonth = temp1;
				endday = temp2;
			}
			if (endyear % 4 == 0 && endyear % 100 != 0 || endyear % 400 == 0)
			{
				a[1] = 29;
			}
			else
			{
				a[1] = 28;
			}
			for (month = startmonth ; month < endmonth ; month++)
			{
				days2 = days2 + a[month - 1];
			}
			days2 = days2 + endday - startday;
			if (flag1 > flag2)
			{
				System.out.print(days - days2);
				System.out.print("\n");
			}
			else
			{
				System.out.print(days + days2);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

