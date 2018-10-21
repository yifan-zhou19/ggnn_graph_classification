package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int mon;
		int day;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int y;
		int m;
		int sumd = 0;
		int lunar = 0;
		while (year > 2800)
		{
			year = year % 2800;
		}
		for (y = 1; y < year; y++)
		{
			if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
			{
				sumd += 366;
			}
			else
			{
				sumd += 365;
			}
		}
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			lunar = 1;
		}
		for (m = 1; m < mon; m++)
		{
			if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10))
			{
				sumd += 31;
			}
			else if ((m == 4) || (m == 6) || (m == 9) || (m == 11))
			{
				sumd += 30;
			}
			else if ((m == 2) && (lunar == 1))
			{
				sumd += 29;
			}
			else
			{
				sumd += 28;
			}
		}
		sumd += day;
		int a = sumd % 7;
		if (a == 0)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		if (a == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		if (a == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		if (a == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		if (a == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		if (a == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		if (a == 6)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}
		return 0;
	}
}

