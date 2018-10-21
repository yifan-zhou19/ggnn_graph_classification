package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:???????????
	 ***??:2013?1?2?
	 *************************/
	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int[] day_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day_sum1 = 0;
		int day_sum2 = 0;
		int i;
		int j;
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
		{
			day_month[1] = 29;
		}
		for (i = 0; i < startmonth - 1; i++)
		{
			day_sum1 += day_month[i];
		}
		day_month[1] = 28;
		day_sum1 += startday;
		for (i = startyear; i < endyear; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				day_sum2 += 366;
			}
			else
			{
				day_sum2 += 365;
			}
		}
		if ((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0))
		{
			day_month[1] = 29;
		}
		for (i = 0; i < endmonth - 1; i++)
		{
			day_sum2 += day_month[i];
		}
		day_sum2 += endday;
		System.out.print(day_sum2 - day_sum1);
		System.out.print("\n");
		return 0;
	}


}

