package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		if (month == 1)
		{
			days = day;
		}
		else if (month == 2)
		{
			days = day + 31;
		}
		else if (month == 3)
		{
			days = day + 59;
		}
		else if (month == 4)
		{
			days = day + 90;
		}
		else if (month == 5)
		{
			days = day + 120;
		}
		else if (month == 6)
		{
			days = day + 151;
		}
		else if (month == 7)
		{
			days = day + 181;
		}
		else if (month == 8)
		{
			days = day + 212;
		}
		else if (month == 9)
		{
			days = day + 243;
		}
		else if (month == 10)
		{
			days = day + 273;
		}
		else if (month == 11)
		{
			days = day + 304;
		}
		else if (month == 12)
		{
			days = day + 334;
		}
		if (year % 100 == 0,year % 400 != 0)
		{
			System.out.printf("%d",days);
		}
		else if (year % 100 != 0,year % 4 != 0)
		{
			System.out.printf("%d",days);
		}
		else if (year % 100 != 0,year % 4 == 0)
		{
			if (month >= 1,month <= 2)
			{
				System.out.printf("%d",days);
			}
			else if (month > 2,month <= 12)
			{
				System.out.printf("%d",days + 1);
			}
		}
		else if (year % 400 == 0)
		{
			if (month >= 1,month <= 2)
			{
				System.out.printf("%d",days);
			}
			else if (month > 2,month <= 12)
			{
				System.out.printf("%d",days + 1);
			}
		}
	}
}

