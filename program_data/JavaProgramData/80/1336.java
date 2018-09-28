package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leap_days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum;
		int sum1;
		int sum2;
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
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
		String tempVar4 = ConsoleInput.scanfRead("\n");
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
		int totalfromfirstday = new int(int year1,int month1,int day1,int year2,int month2,int day2);
		sum1 = totalfromfirstday(startyear, 1, 1, startyear, startmonth, startday);
		sum2 = totalfromfirstday(startyear, 1, 1, endyear, endmonth, endday);
		sum = sum2 - sum1;
		System.out.printf("%d",sum);
	}
	public static int totalfromfirstday(int year1,int month1,int day1,int year2,int month2,int day2)
	{
		int i;
		int j;
		int sum;
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leap_days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		sum = day2;
		for (i = 1;i < month2;i++)
		{
			if (((year2) % 4 == 0 && (year2) % 100 != 0) || ((year2) % 400 == 0))
			{
				sum = sum + leap_days[i];
			}
			else
			{
				sum = sum + days[i];
			}
		}
		for (j = year1;j < year2;j++)
		{
			if ((j % 4 == 0 && j % 100 != 0) || (j % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		return (sum);
	}
}

