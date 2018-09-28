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
		int[] month = new int[11];
		int j;
		int sumday;
		int sum = 0;
		int startdays = 0;
		int enddays = 0;
		month[0] = 31;
		month[1] = 28;
		month[2] = 31;
		month[3] = 30;
		month[4] = 31;
		month[5] = 30;
		month[6] = 31;
		month[7] = 31;
		month[8] = 30;
		month[9] = 31;
		month[10] = 30;
		month[11] = 31;
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
		for (j = 1;j <= startmonth - 1;j++)
		{
		startdays = startdays + month[j - 1];
		}
		startdays = startdays + startday;
		if (((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0)) && (startmonth > 2))
		{
			startdays = startdays + 1;
		}
		for (j = 1;j <= endmonth - 1;j++)
		{
		enddays = enddays + month[j - 1];
		}
		enddays = enddays + endday;
		if (((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0)) && (endmonth > 2))
		{
			enddays = enddays + 1;
		}
		if (startyear == endyear)
		{
			sumday = enddays - startdays;
		}
		else
		{
			for (j = startyear;j <= endyear - 1;j++)
			{
			if ((j % 400 != 0 && j % 100 == 0) || (j % 4 != 0))
			{
				sum = sum + 365;
			}
			else
			{
				sum = sum + 366;
			}
			}
			sumday = sum + enddays - startdays;
		}
		System.out.printf("%d",sumday);
		return 0;
	}
}

