package <missing>;

public class GlobalMembers
{
	/*
	 * days.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 99004
	 */

	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int i;
		int dy;
		int add;
		int days1 = 0;
		int days2 = 0;
		int days;
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dy = (endyear - startyear > 1?(endyear - startyear - 1):0);
		add = 0;
		for (i = startyear + 1;i < endyear;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				add++;
			}
		}
		if ((startyear % 4 == 0 && startyear % 100 != 0) || startyear % 400 == 0)
		{
			add++;
		}
		if ((endyear % 4 == 0 && endyear % 100 != 0) || endyear % 400 == 0)
		{
			add++;
		}
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (startyear != endyear)
		{
		for (i = startmonth;i < 13;i++)
		{
			days1 = days1 + month[i];
		}
		for (i = 1;i < endmonth;i++)
		{
			days2 = days2 + month[i];
		}
		days = 365 * dy + add + days1 + days2 + (endday - startday);
		}
		else
		{
			for (i = startmonth;i < endmonth;i++)
			{
				days1 = days1 + month[i];
			}
			days = days1 + endday - startday;
		}
		System.out.print(days);
		System.out.print("\n");
		return 0;
	}
}

