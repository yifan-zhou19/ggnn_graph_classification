package <missing>;

public class GlobalMembers
{
	public static int check(int year)
	{
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
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
		int date = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int i;
		for (i = 1; i < month; i++)
		{
			date = date + m[i];
			if (i == 2)
			{
				date = date + check(year);
			}
		}
		date = date + day;

		System.out.print(date);
		System.out.print("\n");
	return 0;
	}

}

