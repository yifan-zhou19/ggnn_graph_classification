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
	public static int DiJiTian(int year,int month,int day)
	{
		int result = 0;
		for (int i = 1; i < month; i++)
		{ //step1
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
		result += day; //step2
		return result;
	}

	public static int Main()
	{
		int year;
		int month;
		int day;
		int x = 0;
		int y = 0;
		int z = 0;
		int m;
		int c;
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


		z = (year - 1) + ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400) + DiJiTian(year, month, day);

		if (z % 7 == 1)
		{
			System.out.print("Mon.");
		}
		else if (z % 7 == 2)
		{
			System.out.print("Tue.");
		}
		else if (z % 7 == 3)
		{
			System.out.print("Wed.");
		}
		else if (z % 7 == 4)
		{
			System.out.print("Thu.");
		}
		else if (z % 7 == 5)
		{
			System.out.print("Fri.");
		}
		else if (z % 7 == 6)
		{
			System.out.print("Sat.");
		}
		else if (z % 7 == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

