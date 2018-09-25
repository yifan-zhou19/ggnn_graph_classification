package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int[] month = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] year = {365, 366};
		int i;
		int feb;
		int num = 0;
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (startyear == endyear)
		{
			feb = (endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0);
			month[2] = 28 + feb;
			if (startmonth == endmonth)
			{
				for (i = startday; i < endday; i++)
				{
					num++;
				}
			}
			else
			{
				num += month[startmonth] - startday;
				for (i = startmonth + 1 ; i < endmonth; i++)
				{
					num += month[i];
				}
				num += endday;
			}
		}
		else
		{
			feb = (startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0);
			month[2] = 28 + feb;
			num += month[startmonth] - startday;
			for (i = startmonth + 1; i <= 12; i++)
			{
				num += month[i];
			}
		for (i = startyear + 1; i < endyear; i++)
		{
			feb = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
			month[2] = 28 + feb;
			num += year[feb];
		}
		feb = (endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0);
		month[2] = 28 + feb;

		for (i = 1; i < endmonth ; i++)
		{
			num += month[i];
		}
		num += endday;
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

