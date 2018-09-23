package <missing>;

public class GlobalMembers
{
	public static int[][] days_of_month =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};

	public static int is_leap_year(int year)
	{
		if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
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
		int index = is_leap_year(year);
		int days = 0;
		for (int i = 0; i < month - 1; i++)
		{
			days += days_of_month[index][i];
		}
		days += day;
		System.out.printf("%d", days);
	}
}

