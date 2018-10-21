package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int days = 0;
		int i;
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
		if (year % 400 != 0)
		{
			year = year % 400;
		}
		else
		{
			year = 400;
		}
		for (i = 1;i < year;i++)
		{
			if (i % 4 == 0 && i % 100 != 0)
			{
				days += 366;
			}
			else
			{
				days += 365;
			}
		}
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				days += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			else if ((year % 4 == 0 && year % 100 != 0 || year == 400) && i == 2)
			{
				days += 29;
			}
			else
			{
				days += 28;
			}
		}
		days += day;
		if (days % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (days % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (days % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (days % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (days % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (days % 7 == 6)
		{
			System.out.print("Sat.");
		}
		if (days % 7 == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}


}

