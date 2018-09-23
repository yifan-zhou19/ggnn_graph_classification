package <missing>;

public class GlobalMembers
{
	public static int leap(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int year;
		int month;
		int day;
		int days;
		int i;
		days = 0;
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
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				days += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			if (i == 2)
			{
				if (leap(year) != 0)
				{
					days += 29;
				}
				else
				{
					days += 28;
				}
			}
		}
		days += day;
		System.out.printf("%d\n",days);
	}



}

