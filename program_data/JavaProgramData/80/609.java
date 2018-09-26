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
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int a;
		int days;
		int i;
		int j;
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
		a = endyear - startyear;
		if (startmonth == endmonth)
		{
			days = 365 * a;
		}
		if (startmonth < endmonth)
		{
			days = 365 * a;
			for (i = startmonth;i < endmonth;i++)
			{
				days = days + m[i - 1];
			}
		}
		if (startmonth > endmonth)
		{
			days = 365 * (a - 1);
			for (i = startmonth;i < endmonth + 12;i++)
			{
				days = days + m[i];
			}
		}
		days = days + endday - startday;
		for (j = startyear;j <= endyear;j++)
		{
			if ((j % 4 == 0 && j % 100 != 0) || (j % 400 == 0))
			{
				days = days + 1;
			}
		}
		if (((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0)) && (startmonth > 2))
		{
			days = days - 1;
		}
		if (((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0)) && (endmonth < 2))
		{
			days = days - 1;
		}
		System.out.printf("%d",days);
		return 0;
	}


}

