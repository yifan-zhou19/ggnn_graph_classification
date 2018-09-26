package <missing>;

public class GlobalMembers
{
	public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leapdays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int leapyearornot(int year)
	{
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	public static int sumfromfirstday(int year,int month,int day)
	{
		int i;
		int sum = day;
		for (i = 1;i < month;i++)
		{
			if (leapyearornot(year) != 0)
			{
				sum += leapdays[i];
			}
			else
			{
				sum += days[i];
			}
		}
		return sum;
	}

	public static int daysfromfirst(int startyear,int endyear,int endmonth,int endday)
	{
		int i;
		int sum = 0;
		for (i = startyear;i < endyear;i++)
		{
			sum += leapyearornot(i) != 0?366:365;
		}
		sum += sumfromfirstday(endyear, endmonth, endday);
		return sum;
	}

	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			startmonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			startday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			endyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			endmonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			endday = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d",daysfromfirst(startyear, endyear, endmonth, endday) - daysfromfirst(startyear, startyear, startmonth, startday));
		return 0;
	}

}

