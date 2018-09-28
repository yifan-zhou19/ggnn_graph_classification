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
		int year;
		int month;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
		int day;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startmonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endmonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endday = Integer.parseInt(tempVar6);
		}
		day = 0;
		for (year = startyear;year < endyear;++year)
		{
			day = day + 365;
		}
		if (startmonth < endmonth)
		{
			for (month = startmonth;month < endmonth;++month)
			{
				day = day + a[month - 1];
			}
		}
		else if (startmonth > endmonth)
		{
			for (month = startmonth;month > endmonth;--month)
			{
				day = day - a[month];
			}
		}
		day = day + endday - startday;
		for (year = startyear;year <= endyear;++year)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				++i;
			}
		}
		if (((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0)) && (startmonth > 2))
		{
			i = i - 1;
		}
		if (((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0)) && (endmonth < 2))
		{
			i = i - 1;
		}
		day = day + i;
		System.out.printf("%d\n",day);
		return 0;
	}

}

