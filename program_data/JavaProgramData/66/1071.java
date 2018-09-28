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


	public static int Judge(int year,int month,int day)
	{
		int result = 0;
		if (year % 400 != 0)
		{
			year = year % 400;
		}
		else
		{
			year = 400;
		}
		for (int i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 3;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 2;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 1;
				}
			}
		}
		result += day % 7;
		for (int j = 1;j < year;j++)
		{
			if (isRunNian(j) != 0)
			{
				result += 1;
			}
		}
		result = (result + year - 1) % 7;
		return result;
	}


	public static int Main()
	{
		int year;
		int month;
		int day;
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
		if (Judge(year, month, day) == 1)
		{
			System.out.print("Mon.");
		}
		if (Judge(year, month, day) == 2)
		{
			System.out.print("Tue.");
		}
		if (Judge(year, month, day) == 3)
		{
			System.out.print("Wed.");
		}
		if (Judge(year, month, day) == 4)
		{
			System.out.print("Thu.");
		}
		if (Judge(year, month, day) == 5)
		{
			System.out.print("Fri.");
		}
		if (Judge(year, month, day) == 6)
		{
			System.out.print("Sat.");
		}
		if (Judge(year, month, day) == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

