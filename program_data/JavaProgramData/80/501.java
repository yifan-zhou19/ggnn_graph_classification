package <missing>;

public class GlobalMembers
{
	public static int rYear(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 366;
		}
		else
		{
			return 365;
		}
	}
	public static int MonthDay(int year,int month)
	{
		int day;
		switch (month)
		{
		case 2:
			if (rYear(year) - 365 == 0)
			{
				day = 28;
			}
			else if (rYear(year) - 365 == 1)
			{
				day = 29;
			}
			break;
		case 1:
			;
		case 3:
			;
		case 5:
			;
		case 7:
			;
		case 8:
			;
		case 10:
			;
		case 12:
			day = 31;
			break;
		default :
			day = 30;
			break;
		}
		return day;
	}

	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int num = 0;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = year1;i < year2;i++)
		{
			num += rYear(i);
		}
		for (int j = 1;j < month2;j++)
		{
			num += MonthDay(year2, j);
		}
		for (int k = 1;k < month1;k++)
		{
			num -= MonthDay(year1, k);
		}
		num += day2;
		num -= day1;
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

