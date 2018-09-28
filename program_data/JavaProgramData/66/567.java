package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int year_real;
		int total = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year_real = Integer.parseInt(tempVar);
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
		if (year_real % 400 != 0)
		{
			year = year_real % 400;
		}
		else
		{
			year = 400;
		}
		for (i = 1;i < year;i++)
		{
			if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0))
			{
				total += 366;
			}
			else
			{
				total += 365;
			}
		}
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
		{
			for (i = 1;i < month;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
				{
					total += 31;
				}
				else if (i == 2)
				{
					total += 29;
				}
				else
				{
					total += 30;
				}
			}
		}
		else
		{
			for (i = 1;i < month;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
				{
					total += 31;
				}
				else if (i == 2)
				{
					total += 28;
				}
				else
				{
					total += 30;
				}
			}
		}
		total += day;
		if (total % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (total % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (total % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (total % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (total % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (total % 7 == 6)
		{
			System.out.print("Sat.");
		}
		if (total % 7 == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}


}

