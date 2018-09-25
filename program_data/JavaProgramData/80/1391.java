package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int days = 0;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (year1 != year2)
		{
			if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
			{
				Day[1] = 29;
			}
			days += Day[month1 - 1];
			month1++;
			if (month1 == 13)
			{
				year1++;
				month1 = 1;
				Day[1] = 28;
			}
		}
		while (month1 != month2)
		{
			if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
			{
				Day[1] = 29;
			}
			days += Day[month1 - 1];
			month1++;
		}
		days += day2;
		days -= day1;
		System.out.print(days);
		System.out.print("\n");
		return 0;
	}

}

