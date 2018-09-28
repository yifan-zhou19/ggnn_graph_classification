package <missing>;

public class GlobalMembers
{
	public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leap_days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int isLeapYear(int year)
	{
		 return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	 //????????(day,month)?????   
	 public static int sumFromFirstDay(int year, int month, int day)
	 {
		int i;
		int ret = day;
		for (i = 1; i < month; i++)
		{
			if (isLeapYear(year) != 0)
			{
				ret = ret + leap_days[i];
			}
			else
			{
				ret = ret + days[i];
			}
		}
		return ret;
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
		 int i;
		 int sum = 0;
		for (i = startYear + 1; i < endYear; i++)
		{
			sum += isLeapYear(i) != 0 ? 366 : 365;
		}
		int start = sumFromFirstDay(startYear, startMonth, startDay);
		int end = sumFromFirstDay(endYear, endMonth, endDay);
	  if (startYear == endYear)
	  {
		  sum += end - start;
	  }
	   else
	   {
			sum += (365 - start) + end;
		   if (isLeapYear(startYear) != 0)
		   {
			   sum++;
		   }
	   }
		System.out.printf("%d",sum);
	   return 0;
	 }

}

