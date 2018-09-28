package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startYear; //???????????
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startMonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startDay = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endYear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endMonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endDay = Integer.parseInt(tempVar6);
		}
		int sum = 0; //????????????????
		int sumYear = 0;
		int sumMonth = 0;
		int sumDay = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //????12?????
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //????12?????
		int i;
		//?????????? 
		{
			if (startDay < endDay)
			{
					for (i = startDay;i < endDay;i++)
					{
						sumDay += 1;
					}
			}
			else if (startDay > endDay)
			{
					for (i = startDay;i > endDay;i--)
					{
						sumDay -= 1;
					}
			}
		}
		{
		//?????????? 
			if (startMonth < endMonth)
			{
					if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
					{
							for (i = startMonth;i < endMonth;i++)
							{
								sumMonth += b[i]; //??????????????
							}
					}
					else
					{
						for (i = startMonth;i < endMonth;i++)
						{
							sumMonth += a[i];
						}
					}
			}
			else if (startMonth > endMonth)
			{
					if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
					{
							for (i = startMonth;i > endMonth;i--)
							{
								sumMonth -= b[i];
							}
					}
					else
					{
						for (i = startMonth;i > endMonth;i--)
						{
							sumMonth -= a[i];
						}
					}
			}
	}
	{
		//??????????
			if (startYear < endYear)
			{
					for (i = startYear;i < endYear;i++)
					{
						if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
						{
							sumYear += 366;
						}
						else
						{
							sumYear += 365;
						}
					}
			}
	}
		sum = sumDay + sumMonth + sumYear;
		System.out.printf("%d",sum);
		return 0;
	}
}

