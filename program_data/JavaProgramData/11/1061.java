package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int mon;
		int d;
		int month = 1;
		int day = 1;
		int lunar = 0;
		int days = 1;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			lunar = 1;
		}
		while ((mon != month) || (d != day))
		{
			day++;
			days++;
			if ((day == 32) && ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)))
			{
						month++;
						day = 1;
			}
				if ((day == 31) && ((month == 4) || (month == 6) || (month == 9) || (month == 11)))
				{
						month++;
						day = 1;
				}
				if ((day == 30) && (month == 2) && (lunar == 1))
				{
						month++;
						day = 1;
				}
				if ((day == 29) && (month == 2) && (lunar == 0))
				{
						month++;
						day = 1;
				}
		}
		System.out.print(days);
		System.out.print("\n");
		return 0;
	}
}

