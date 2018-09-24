package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sum_day = new int(int,int);
		int leap = int year;
		int year;
		int month;
		int day;
		int days;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		days = sum_day(month, day);
		if (leap(year) != 0 && month >= 3)
		{
			days = days + 1;
		}
		System.out.printf("%d",days);
	}
	public static int sum_day(int month,int day)
	{
		int[] day_tab = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		for (i = 1;i < month;i++)
		{
			day += day_tab[i];
		}
		return (day);
	}
	public static int leap(int year)
	{
		int leap;
		leap = year % 3 == 0 && year % 100 != 0 || year % 400 == 0;
		return (leap);
	}



}

