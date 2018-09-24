package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year = 0;
		int month = 0;
		int day = 0;
		int day2 = 0;
		int day3 = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int sum = 0;
		int day1 = 0;
		int sum2 = 0;
		sum = (year - 1) / 4 * 5 + (year - 1) % 4 - year / 100 + year / 400;
		day1 = sum % 7 + 1;
		if (day1 == 0)
		{
			day1 = 7;
		}
		int[] yue = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			yue[2] = 29;
		}
		if (month == 1)
		{
			sum2 = 0;
		}
		else
		{
			for (i = 1; i <= month - 1 ; i++)
			{
				sum2 = sum2 + yue[i];
			}
		}
		sum2 = sum2 + day - 1;
		day2 = sum2 % 7;
		day3 = (day2 + day1) % 7;
		if (day3 == 0)
		{
			day3 = 7;
		}
		if (day3 == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		if (day3 == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		if (day3 == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		if (day3 == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		if (day3 == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		if (day3 == 6)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}
		if (day3 == 7)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		return 0;
	}
}

