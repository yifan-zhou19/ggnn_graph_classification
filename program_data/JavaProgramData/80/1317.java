package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int GongJiTian = new int(int, int, int);
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		int result;
		int a;
		int b;
		a = GongJiTian(year1, month1, day1);
		b = GongJiTian(year2, month2, day2);
		if (a > b)
		{
			result = a - b;
		}
		else
		{
			result = b - a;
		}
		System.out.printf("%d", result);
		return 0;
	}

	public static int DiJiTian(int year, int month, int day)
	{
		int isRunNian = int;
		int result = 0;
		int i;
		for (i = 1;i < month;i++)
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

	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}

	public static int GongJiTian(int year, int month, int day)
	{
		int DiJiTian = new int(int, int, int);
		int result = 0;
		int i;
		for (i = 1;i < year;i++)
		{
			if (isRunNian(i) != 0)
			{
				result += 366;
			}
			else
			{
				result += 365;
			}
		}
		result += DiJiTian(year, month, day);
		return result;
	}
}

