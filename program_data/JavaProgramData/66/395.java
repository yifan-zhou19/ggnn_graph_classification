package <missing>;

public class GlobalMembers
{
	public static int DiJiTian(int year, int month, int day)
	{
		int result = 0;
		for (int i = 1; i < month; i++)
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
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		int runnian = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (year > 2800)
		{
			year = year - (year / 2800) * 2800;
		}
		for (i = 1;i < year;i++)
		{
			if (isRunNian(i) != 0)
			{
				runnian++;
			}
		}

		sum = (year - 1 - runnian) * 365 + runnian * 366 + DiJiTian(year, month, day);
		j = sum % 7;
		if (j == 1)
		{
			System.out.print("Mon.");
		}
		else if (j == 2)
		{
			System.out.print("Tue.");
		}
		else if (j == 3)
		{
			System.out.print("Wed.");
		}
		else if (j == 4)
		{
			System.out.print("Thu.");
		}
		else if (j == 5)
		{
			System.out.print("Fri.");
		}
		else if (j == 6)
		{
			System.out.print("Sat.");
		}
		else if (j == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

