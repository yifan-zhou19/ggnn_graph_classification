package <missing>;

public class GlobalMembers
{
	public static int[] B = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] A = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int runnian(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int count1(int startmonth,int startday,int endmonth,int endday)
	{
		int result = 0;
		int i;
		if (startmonth <= endmonth)
		{
			for (i = startmonth;i < endmonth;i++)
			{
				result = result + A[i - 1];
			}
			result = result + endday - startday;
		}
		else
		{
			for (i = startmonth;i > endmonth;i--)
			{
				result = result - A[i - 2];
			}
			result = result + endday - startday;
		}
		return result;
	}
	public static int count2(int startmonth,int startday,int endmonth,int endday)
	{
		int result = 0;
		int i;
		if (startmonth <= endmonth)
		{
			for (i = startmonth;i < endmonth;i++)
			{
				result = result + B[i - 1];
			}
			result = result + endday - startday;
		}
		else
		{
			for (i = startmonth;i > endmonth;i--)
			{
				result = result - B[i - 2];
			}
			result = result + endday - startday;
		}
		return result;
	}
	public static int Main()
	{
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int i;
		int sum = 0;
		int temp;
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
		if (startYear == endYear)
		{
			if (runnian(startYear) != 0)
			{
				sum = count1(startMonth, startDay, endMonth, endDay);
			}
			else
			{
				sum = count2(startMonth, startDay, endMonth, endDay);
			}
		}
		else
		{
			if (startYear > endYear)
			{
				temp = endYear;
				endYear = startYear;
				startYear = temp;
				temp = endMonth;
				endMonth = startMonth;
				startMonth = temp;
				temp = endDay;
				endDay = startDay;
				startDay = temp;
			}
		}
		if (startYear < endYear)
		{
			for (i = startYear;i < endYear;i++)
			{
				if (runnian(i) != 0)
				{
					sum = sum + 366;
				}
				else
				{
					sum = sum + 365;
				}
			}
			if (runnian(endYear) != 0)
			{
				sum = sum + count1(startMonth, startDay, endMonth, endDay);
			}
			else
			{
				sum = sum + count2(startMonth, startDay, endMonth, endDay);
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

