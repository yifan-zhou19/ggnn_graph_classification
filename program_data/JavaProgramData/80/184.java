package <missing>;

public class GlobalMembers
{
	public static int RunNian(int year)
	{
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Dijitian(int year,int month,int day)
	{
		int total = 0;
		int i;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total += 30;
			}
			if (i == 2)
			{
				if (RunNian(year) != 0)
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}
		total += day;
		return total;
	}
	public static int Main()
	{
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startYear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			startMonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			startDay = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endYear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			endMonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			endDay = Integer.parseInt(tempVar6);
		}
		int num = 0;
		if (startYear == endYear)
		{
			num = Dijitian(endYear, endMonth, endDay) - Dijitian(startYear, startMonth, startDay);
		}
		else
		{
			int i;
			for (i = startYear;i < endYear;i++)
			{
				if (RunNian(i) != 0)
				{
					num += 366;
				}
				else
				{
					num += 365;
				}
			}
			num += Dijitian(endYear, endMonth, endDay) - Dijitian(startYear, startMonth, startDay);
		}
		System.out.printf("%d\n",num);
		return 0;
	}
}

