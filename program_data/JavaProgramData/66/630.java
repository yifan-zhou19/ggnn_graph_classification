package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int year;
		int month;
		int day;
		int days = 0;

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
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			else if (i == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year != 0))
				{
					days += 29;
				}
				else
				{
					days += 28;
				}
			}
		}
		year = year - 1;
		days += year / 4 + year / 400 - year / 100 + year;
		days += day;
		a = days % 7;
		if (a == 0)
		{
			System.out.print("Sun.");
		}
		else if (a == 1)
		{
			System.out.print("Mon.");
		}
		else if (a == 2)
		{
			System.out.print("Tue.");
		}
		else if (a == 3)
		{
			System.out.print("Wed.");
		}
		else if (a == 4)
		{
			System.out.print("Thu.");
		}
		else if (a == 5)
		{
			System.out.print("Fri.");
		}
		else if (a == 6)
		{
			System.out.print("Sat.");
		}
		return 0;
	}


}

