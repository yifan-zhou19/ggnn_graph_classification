package <missing>;

public class GlobalMembers
{
	public static int judge_year(int year) //?????????
	{
		if (year % 400 == 0)
		{
			return 1;
		}
		if (year % 100 == 0)
		{
			return 0;
		}
		if (year % 4 == 0)
		{
			return 1;
		}
		return 0;
	}

	public static int Main()
	{
		int i;
		int sumdays = 0;
		int[] monthdays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		if (judge_year(startYear) != 0) //???
		{
			monthdays[2] = 29; //????????
		}
		if (startYear == endYear) //????
		{
			if (startMonth == endMonth) //????
			{
				sumdays = endDay - startDay;
				System.out.printf("%d",sumdays);
				return 0;
			}
			else
			{
				for (i = startMonth + 1;i < endMonth;i++)
				{
					sumdays += monthdays[i];
				}
				sumdays += monthdays[startMonth] - startDay;
				sumdays += endDay;
				System.out.printf("%d",sumdays);
				return 0;
			}
		}
		//?????
		//??????????
		for (i = startYear + 1;i < endYear;i++)
		{
			sumdays += judge_year(i) + 365;
		}
		//????????
		for (i = startMonth + 1;i <= 12;i++)
		{
			sumdays += monthdays[i];
		}
		sumdays += monthdays[startMonth] - startDay;
		//??????
		//????????
		if (judge_year(endYear) != 0)
		{
			monthdays[2] = 29;
		}
		else
		{
			monthdays[2] = 28;
		}
		for (i = 1;i < endMonth;i++)
		{
			sumdays += monthdays[i];
		}
		sumdays += endDay;
		System.out.printf("%d",sumdays);
		return 0;
	}

}

