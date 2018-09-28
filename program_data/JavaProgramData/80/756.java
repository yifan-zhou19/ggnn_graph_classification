package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int i;
		int day1 = 0;
		int day2 = 0;
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
		String tempVar4 = ConsoleInput.scanfRead();
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
		for (i = 0;i < startyear;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				day1 += 366;
			}
			else
			{
				day1 += 365;
			}
		}
		for (i = 1;i < startmonth;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				day1 += 31;
			}
			else
			{
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					day1 += 30;
				}
				else
				{
					if (((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0)) && i == 2)
					{
						day1 += 29;
					}
					else
					{
						day1 += 28;
					}
				}
			}
		}
		day1 += startday;
		 for (i = 0;i < endyear;i++)
		 {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				day2 += 366;
			}
			else
			{
				day2 += 365;
			}
		 }
		for (i = 1;i < endmonth;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				day2 += 31;
			}
			else
			{
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					day2 += 30;
				}
				else
				{
					if (((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0)) && i == 2)
					{
						day2 += 29;
					}
					else
					{
						day2 += 28;
					}
				}
			}
		}
		day2 += endday;
		System.out.printf("%ld\n",day2 - day1);
	}
}

