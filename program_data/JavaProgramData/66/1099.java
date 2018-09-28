package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static int DiJiTian(int year, int month, int day)
	{
	int result = 0;
	int i;
	for (i = 1; i < month; i++)
	{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		{
			result += 31;
		}
		else if (i == 4 || i == 6 || i == 9 || i == 11)
		{
			result += 30;
		}
		else if (i == 2)
		{
			if (isRunNian(year) != 0)
			{
				result += 29;
			}
			else
			{
				result += 28;
			}
		}
	}
	result += day;

	return result;
	}
	public static int Main()
	{
		int sy;
		int year1;
		int month1;
		int day1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}

	sy = (DiJiTian(year1, month1, day1) + 1 * (year1 - 1) + ((year1 - 1) / 4 - (year1 - 1) / 100 + (year1 - 1) / 400)) % 7;
	if (sy == 0)
	{
		System.out.print("Sun.");
	}
	if (sy == 1)
	{
		System.out.print("Mon.");
	}
	if (sy == 2)
	{
		System.out.print("Tue.");
	}
	if (sy == 3)
	{
		System.out.print("Wed.");
	}
	if (sy == 4)
	{
		System.out.print("Thu.");
	}
	if (sy == 5)
	{
		System.out.print("Fri.");
	}
	if (sy == 6)
	{
		System.out.print("Sat.");
	}

	return 0;
	}

}

