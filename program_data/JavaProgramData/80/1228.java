package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		final int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
		final int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};

		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int i;
		int k;
		int days;
		int flag;

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

		days = 0;
	//????????
		if (startYear == endYear)
		{
			//??
			if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
			{
				//????????
				if (startMonth == endMonth)
				{
					days = endDay - startDay;
				}
				//?????????
				else
				{
					for (k = startMonth;k < endMonth;k++)
					{
						days += month2[k];
					}
					days += endDay - startDay;
				}
			}
			//??
			else
			{
				if (startMonth == endMonth)
				{
					days = endDay - startDay;
				}
				else
				{
					for (k = startMonth;k < endMonth;k++)
					{
						days += month1[k];
					}
					days += endDay - startDay;
				}
			}
			System.out.printf("%d",days);
		}
	//?????????
		for (i = startYear; i <= endYear; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
			//???
			if (i == startYear)
			{
				if (flag == 1)
				{
					for (k = startMonth;k <= 12;k++)
					{
						days += month2[k];
					}
				}
				else
				{
					for (k = startMonth;k <= 12;k++)
					{
						days += month1[k];
					}
				}
				days -= startDay;
			}
			//???
			else if (i == endYear)
			{
				if (flag == 1)
				{
					for (k = 1;k < endMonth;k++)
					{
						days += month2[k];
					}
				}
				else
				{
					for (k = 1;k < endMonth;k++)
					{
						days += month1[k];
					}
				}
				days += endDay;
			}
			//?????+365 ? +366
			else
			{
				if (flag == 1)
				{
					for (k = 1;k <= 12;k++)
					{
						days += month2[k];
					}
				}
				else
				{
					for (k = 1;k <= 12;k++)
					{
						days += month1[k];
					}
				}
			}
		}
		System.out.printf("%d",days);
	}
}

