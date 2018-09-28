package <missing>;

public class GlobalMembers
{
	public static int dijitian(int year, int month, int day)
	{
		int i;
		int total = 0;
		for (i = 1;i < month;i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				total += 31;
			}
			else if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
			{
				total += 30;
				\
			}
			else if (i == 2)
			{
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
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
		return (total);
	}
	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		int total = 0;
		int year2;
		int month2;
		int day2;
		int result;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		int i;
		if (year1 == year2)
		{
			result = dijitian(year2, month2, day2) - dijitian(year1, month1, day1);
		}
		else
		{
			for (i = year1 + 1;i < year2;i++)
			{
				if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
				{
					total += 366;
				}
				else
				{
					total += 365;
				}
			}
			if ((year1 % 400 == 0) || ((year1 % 4 == 0) && (year1 % 100 != 0)))
			{
				result = 366 - dijitian(year1, month1, day1) + dijitian(year2, month2, day2) + total;
			}
			else
			{
				result = 365 - dijitian(year1, month1, day1) + dijitian(year2, month2, day2) + total;
			}
		}
		System.out.printf("%d\n",result);
		return 0;
	}

}

