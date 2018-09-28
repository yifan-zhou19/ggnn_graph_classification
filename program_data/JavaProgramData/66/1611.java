package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int c;
		int y;
		int m;
		int d;
		int week;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (month == 1 || month == 2)
		{
			month += 12;
			year--;
		}
		c = year / 100;
		y = year % 100;
		m = month;
		d = day;
		week = y % 7 + (y / 4) % 7 + (c / 4) % 7 - (2 * c) % 7 + (26 * (m + 1) / 10) % 7 + d - 1;
		week %= 7;
		if (week == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		else if (week == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		else if (week == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		else if (week == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		else if (week == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		else if (week == 6)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}
		else if (week == 0)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		return 0;
	}

}

